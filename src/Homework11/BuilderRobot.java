package Homework11;

public class BuilderRobot implements EngineerRobot {
    private String model;
    private int power;
    private String country;
    private String buildingUnit;
    private String material;
    private boolean isOn;

    public BuilderRobot(String model, int power, String country, String buildingUnit, String material) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.buildingUnit = buildingUnit;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включен. Готов к строительству!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(model + " выключен. Работа завершена.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " использует " + buildingUnit + " для строительства с использованием материала " + material + ".");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создает бетон для строительства.");
    }
}