public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        Client client1 = new Client("Elzhan");
        Client client2 = new Client("Baglan");

        notificationService.addClient(client1);
        notificationService.addClient(client2);

        CarDealershipFacade dealership = new CarDealershipFacade();

        Car car1 = dealership.orderCar("Economy", true, false);
        dealership.reserveCar(car1);
        dealership.sellCar(car1);

        Car car2 = dealership.orderCar("Luxury", false, true);
        dealership.reserveCar(car2);
    }
}
