package Homework11;

public interface Robot {
          default void repair() {
            System.out.println("Отремонтировать робота...");
        }

        void turnOn();

        void turnOff();

        void uniquePossibility();
}