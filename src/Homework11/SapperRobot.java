package Homework11;

public class SapperRobot implements EngineerRobot {
    private String model;
    private int power;
    private String deminingTool;
    private String material;
    private boolean isOn;

    public SapperRobot(String model, int power, String deminingTool, String material) {
        this.model = model;
        this.power = power;
        this.deminingTool = deminingTool;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void repair() {
        System.out.println(model + " требует ремонта, используя материал " + material + ".");
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включен. Начинаем разминирование!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(model + " выключен. Работа завершена.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " использует " + deminingTool + " для разминирования.");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создает приспособление для разминирования.");
    }
}