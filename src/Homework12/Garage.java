package Homework12;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public void parkVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public boolean isEntryPermitted() {
        if (vehicle != null) {
            return vehicle.getEmissions() <= 100;
        } else {
            throw new IllegalStateException("В гараже нет транспортного средства для проверки!");
        }
    }
}