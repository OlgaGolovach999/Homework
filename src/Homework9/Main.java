package Homework9;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        animal.play();

        Dog rex = new Dog("Рекс", "Немецкая овчарка", 25);

        rex.bark();
        rex.bite();
        rex.run();
        rex.play();
        rex.jump();


        Bird sparrow = new Bird("Воробей", 150);
        sparrow.makeSound();
        sparrow.play();
        sparrow.peck();
        sparrow.hatchChicks();
        System.out.println(rex.toString());

        System.out.println(sparrow.toString());

        System.out.println(animal.toString());

        Zoo zoo = new Zoo();

        Dog dog1 = new Dog("Люси", "Динго", 30);
        Dog dog2 = new Dog("Белла", "Лабрадор", 28);
        Dog dog3 = new Dog("Чарли", "Бигль", 20);

        Bird bird1 = new Bird("Аист", 250);
        Bird bird2 = new Bird("Орёл", 150);
        Bird bird3 = new Bird("Попугай", 50);

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);

        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        Animal[] animals = zoo.getAnimals();
        System.out.println("Животные в зоопарке:");
        for (Animal newAnimal : animals) {
            newAnimal.makeSound();
            newAnimal.play();
        }
    }
}
