package Homework9;

public class Animal {
    private String color;
    protected int longLife;
    private String typeofFood;

    public void makeSound() {
        System.out.println("Животное издает звук...");
    }

    public void play() {
        System.out.println("Животное играет...");
    }

    @Override
    public String toString() {
        return "Это животное";
    }
}
