package Homework11;

public class Main {
    public static void main(String[] args) {

        CookRobot cookRobot = new CookRobot("Адский шеф", 1500, "Япония", "Духовка");
        SapperRobot sapperRobot = new SapperRobot("Бессмертный", 2000, "Шасси номер 25", "Титановый сплав");
        BuilderRobot builderRobot = new BuilderRobot("Золотые руки", 1800, "Китай", "Экскаватор", "Сталь");

        System.out.println("Отремонтировать робота:");
        cookRobot.repair();
        sapperRobot.repair();
        builderRobot.repair();

        cookRobot.turnOn();
        sapperRobot.turnOn();
        builderRobot.turnOn();

        cookRobot.turnOff();
        sapperRobot.turnOff();
        builderRobot.turnOff();

        Robot[] allRobotsExhibition = {cookRobot, sapperRobot, builderRobot};
        System.out.println("Первая выставка: Все роботы");
        for (Robot robot : allRobotsExhibition) {
            robot.uniquePossibility();
        }

        EngineerRobot[] engineerRobotsExhibition = {sapperRobot, builderRobot};
        System.out.println("Вторая выставка: Роботы-инженеры");
        for (EngineerRobot engineerRobot : engineerRobotsExhibition) {
            engineerRobot.uniquePossibility();
            engineerRobot.createItem();
        }

        SapperRobot[] sapperRobotsExhibition = {sapperRobot};
        System.out.println("Третья выставка: Роботы-сапёры");
        for (SapperRobot sapper : sapperRobotsExhibition) {
            sapper.uniquePossibility();
        }
    }
}