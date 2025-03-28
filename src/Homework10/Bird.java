package Homework10;

import Homework9.Animal;

public class Bird extends Animal {
    private String family;
    private int maxFlightHeight;

    public Bird(String family, int maxFlightHeight) {
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Bird bird = (Bird) obj;

        if (longLife != bird.longLife) return false;
        if (maxFlightHeight != bird.maxFlightHeight) return false;
        return family != null ? family.equals(bird.family) : bird.family == null;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + longLife;
        result = 31 * result + maxFlightHeight;
        result = 31 * result + (family != null ? family.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Птица: Семейство - " + family + ", Максимальная высота полета - " + maxFlightHeight + " м.";
    }
}