class CarDealershipFacade {
    private Database database;
    private CarFactory carFactory;
    private NotificationService notificationService;

    CarDealershipFacade() {
        database = Database.getInstance();
        carFactory = new CarFactory();
        notificationService = new NotificationService();
    }

    public Car orderCar(String type, boolean withSunroof, boolean withSportsPackage) {
        Car car = carFactory.createCar(type);
        if (car != null) {
            if (withSunroof) {
                car = new SunroofDecorator(car);
            }
            if (withSportsPackage) {
                car = new SportsPackageDecorator(car);
            }
            car.assemble();
            database.saveData(car.toString());
            notificationService.notifyClients("New car available: " + car);
        }
        return car;
    }

    public void reserveCar(Car car) {
        car.setState(new ReservedState());
    }

    public void sellCar(Car car) {
        car.setState(new SoldState());
    }
}
