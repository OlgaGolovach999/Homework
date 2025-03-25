package Homework9;

public class Zoo {
    private Animal[] animals;

    public Zoo() {
        animals = new Animal[0];
    }

    public void addAnimal(Animal animal) {

        Animal[] copyAnimals = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; i++) {
            copyAnimals[i] = animals[i];
        }
        copyAnimals[animals.length] = animal;
        animals = copyAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}