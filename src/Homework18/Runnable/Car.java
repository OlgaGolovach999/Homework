package Homework18.Runnable;

public class Car implements Runnable {
    private String name;
    private String licensePlate;
    private int stopTime;

    public Car(String name, String licensePlate, int stopTime) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.stopTime = stopTime;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public int getStopTime() {
        return stopTime;
    }
    public void setStopTime(int stopTime) {
        this.stopTime = stopTime;
    }

    public void drive() {
        System.out.println(name + " с гос. номером " + licensePlate + " начал движение.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " едет... " + i + " секунда");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Ошибка при движении машины " + name);
            }
        }
        System.out.println(name + " завершил движение.");

        if (stopTime > 0) {
            System.out.println(name + " останавливается на " + stopTime + " секунд.");
            try {
                Thread.sleep(stopTime * 1000);
            } catch (InterruptedException e) {
                System.out.println("Ошибка во время остановки машины " + name);
            }
            System.out.println(name + " окончательно остановилась.");
        } else {
            System.out.println(name + " не делает остановку.");
        }
    }

    @Override
    public void run() {
        drive();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", stopTime=" + stopTime +
                '}';
    }
}