abstract class Car {
    String model;
    String type;
    double price;
    CarState state;

    void setState(CarState state) {
        this.state = state;
        state.handleState(this);
    }

    abstract void assemble();

    @Override
    public String toString() {
        return "Model: " + model + ", Type: " + type + ", Price: " + price;
    }
}

class EconomyCar extends Car {
    EconomyCar() {
        model = "Chevrolet Cobalt";
        type = "Economy";
        price = 20000;
    }

    void assemble() {
        System.out.println("Assembling an economy car");
    }
}

class LuxuryCar extends Car {
    LuxuryCar() {
        model = "Toyota Camry";
        type = "Luxury";
        price = 50000;
    }

    void assemble() {
        System.out.println("Assembling a luxury car");
    }
}

class CarFactory {
    public Car createCar(String type) {
        Car car;
        if (type.equalsIgnoreCase("Economy")) {
            car = new EconomyCar();
        } else if (type.equalsIgnoreCase("Luxury")) {
            car = new LuxuryCar();
        } else {
            return null;
        }
        car.setState(new AvailableState());
        return car;
    }
}
