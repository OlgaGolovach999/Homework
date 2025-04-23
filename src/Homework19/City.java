package Homework19;

import java.util.Objects;

public class City {
    private int id;
    private String name;
    private long population;
    private Continent continent;

    public City(int id, String name, long population, Continent continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {
        this.population = population;
    }
    public Continent getContinent() {
        return continent;
    }
    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", continent=" + continent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return id == city.id &&
                population == city.population &&
                Objects.equals(name, city.name) &&
                continent == city.continent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, population, continent);
    }
}