package Homework19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        StringProcessor processor = s -> s.toUpperCase();
        String input = "Hello, Olga!";
        System.out.println("Обработанная строка с большими буквами: " + processor.process(input));

        List<City> cities = new ArrayList<>();
        cities.add(new City(1, "Tokyo", 37435191, Continent.ASIA));
        cities.add(new City(2, "Delhi", 29399141, Continent.ASIA));
        cities.add(new City(3, "Shanghai", 26317104, Continent.ASIA));
        cities.add(new City(4, "Mumbai", 20185064, Continent.ASIA));
        cities.add(new City(5, "Paris", 2148327, Continent.EUROPE));
        cities.add(new City(6, "London", 8982000, Continent.EUROPE));
        cities.add(new City(7, "Berlin", 3644826, Continent.EUROPE));
        cities.add(new City(8, "Sydney", 3223334, Continent.AUSTRALIA));
        cities.add(new City(9, "New York", 8419000, Continent.NORTH_AMERICA));
        cities.add(new City(10, "Los Angeles", 3980400, Continent.NORTH_AMERICA));
        cities.add(new City(11, "Sao Paulo", 12252023, Continent.SOUTH_AMERICA));
        cities.add(new City(12, "Cairo", 10230350, Continent.AFRICA));

        City maxInAsia = cities.stream()
                .filter(city -> city.getContinent() == Continent.ASIA)
                .max(Comparator.comparingLong(City::getPopulation))
                .orElse(null);
        System.out.println("Самый густонаселённый город в Азии: " + maxInAsia);

        City minInEurope = cities.stream()
                .filter(city -> city.getContinent() == Continent.EUROPE)
                .min(Comparator.comparingLong(City::getPopulation))
                .orElse(null);
        System.out.println("Город с минимальным населением в Европе: " + minInEurope);

        City maxCity = cities.stream()
                .max(Comparator.comparingLong(City::getPopulation))
                .orElse(null);
        System.out.println("Самый густонаселённый город: " + maxCity);

        City minCity = cities.stream()
                .min(Comparator.comparingLong(City::getPopulation))
                .orElse(null);
        System.out.println("Город с самым маленьким населением: " + minCity);

        Optional<City> firstOverOneMillion = cities.stream()
                .filter(city -> city.getPopulation() > 1_000_000)
                .findFirst();
        System.out.println("Первый город с населением больше 1 млн: " + firstOverOneMillion.orElse(null));

        List<City> citiesOverOneMillion = cities.stream()
                .filter(city -> city.getPopulation() > 1_000_000)
                .collect(Collectors.toList());
        System.out.println("Города с населением больше 1 млн: " + citiesOverOneMillion);

        List<String> cityNames = cities.stream()
                .map(City::getName)
                .collect(Collectors.toList());
        System.out.println("Названия городов: " + cityNames);
    }
}