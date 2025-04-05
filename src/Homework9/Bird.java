package Homework9;

public class Bird extends Animal {
    private String family;
    private int maxFlightHeight;

    public Bird(String family, int maxFlightHeight) {
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    @Override
    public void makeSound() {
        System.out.println(family + " поет.");
    }

    @Override
    public void play() {
        System.out.println(family + " летает и играет в воздухе.");
    }

    public void peck() {
        System.out.println(family + " клюет еду.");
    }

    public void hatchChicks() {
        System.out.println(family + " высиживает птенцов.");
    }

    @Override
    public String toString() {
        return "Птица: Семейство - " + family + ", Максимальная высота полета - " + maxFlightHeight + " м.";
    }
}
