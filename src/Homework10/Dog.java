package Homework10;

import Homework9.Animal;

public class Dog extends Animal {
    private String name;
    private String breed;
    protected int weight;

    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Dog dog = (Dog) obj;

        if (longLife != dog.longLife) return false;
        if (weight != dog.weight) return false;
        if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
        return breed != null ? breed.equals(dog.breed) : dog.breed == null;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + longLife;
        result = 31 * result + weight;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Собака: " + name + ", Порода: " + breed + ", Вес: " + weight + " кг.";
    }
}