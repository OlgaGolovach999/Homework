package Homework9;

public class Dog extends Animal {
    private String name;
    private String breed;
    protected int weight;

    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void bark() {
        System.out.println(name + " лает.");
    }

    public void bite() {
        System.out.println(name + " кусает.");
    }

    public void run() {
        System.out.println(name + " бегает.");
    }

    public void jump() {
        System.out.println(name + " прыгает.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " лает.");
    }

    @Override
    public void play() {
        System.out.println(name + " бегает и играет с мячом.");
    }

    @Override
    public String toString() {
        return "Собака: " + name + ", Порода: " + breed + ", Вес: " + weight + " кг.";
    }
}
