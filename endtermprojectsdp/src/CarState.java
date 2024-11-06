interface CarState {
    void handleState(Car car);
}

class AvailableState implements CarState {
    public void handleState(Car car) {
        System.out.println(car.model + " is now available for sale.");
    }
}

class ReservedState implements CarState {
    public void handleState(Car car) {
        System.out.println(car.model + " is now reserved.");
    }
}

class SoldState implements CarState {
    public void handleState(Car car) {
        System.out.println(car.model + " has been sold.");
    }
}
