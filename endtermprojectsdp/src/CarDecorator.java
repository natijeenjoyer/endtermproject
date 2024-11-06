abstract class CarDecorator extends Car {
    protected Car decoratedCar;

    CarDecorator(Car car) {
        this.decoratedCar = car;
    }

    @Override
    public void assemble() {
        decoratedCar.assemble();
    }

    @Override
    public String toString() {
        return decoratedCar.toString();
    }
}

class SunroofDecorator extends CarDecorator {
    SunroofDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding a sunroof to " + decoratedCar.model);
    }

    @Override
    public String toString() {
        return super.toString() + " + Sunroof";
    }
}

class SportsPackageDecorator extends CarDecorator {
    SportsPackageDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sports package to " + decoratedCar.model);
    }

    @Override
    public String toString() {
        return super.toString() + " + Sports Package";
    }
}
