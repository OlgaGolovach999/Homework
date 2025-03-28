package Homework10;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Рекс", "Лабрадор", 30);
        Dog dog2 = new Dog("Рекс", "Лабрадор", 30);

        Bird bird1 = new Bird("Воробьиные", 150);
        Bird bird2 = new Bird("Воробьиные", 150);

        System.out.println(dog1.equals(dog2));
        System.out.println(bird1.equals(bird2));

        System.out.println(dog1.hashCode() == dog2.hashCode());
        System.out.println(bird1.hashCode() == bird2.hashCode());
    }
}