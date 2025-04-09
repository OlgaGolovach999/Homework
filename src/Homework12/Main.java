package Homework12;

public class Main {
    public static void main(String[] args) {
        Garage<Car> carGarage = new Garage<>();
        Car car = new Car("Toyota", 80);
        carGarage.parkVehicle(car);

        System.out.println("Гараж 1:");
        System.out.println("Транспортное средство: " + carGarage.getVehicle().getName());
        System.out.println("Въезд разрешён? " + carGarage.isEntryPermitted());

        Garage<Motorcycle> motorcycleGarage = new Garage<>();
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 120);
        motorcycleGarage.parkVehicle(motorcycle);

        System.out.println("\nГараж 2:");
        System.out.println("Транспортное средство: " + motorcycleGarage.getVehicle().getName());
        System.out.println("Въезд разрешён? " + motorcycleGarage.isEntryPermitted());
    }
}