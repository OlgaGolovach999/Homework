package Homework11;

public class CookRobot implements Robot {
    private String model;
    private int power;
    private String country;
    private String cookingUnit;
    private boolean isOn;
    public CookRobot(String model, int power, String country, String cookingUnit) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.cookingUnit = cookingUnit;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включен. Готов к приготовлению еды!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(model + " выключен. Пока!");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " использует " + cookingUnit + " для приготовления блюд.");
    }
}