package Homework15;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {

        Employer employer1 = new Employer(1, "Иван", "Иванов", 30, 2500);
        Employer employer2 = new Employer(2, "Анна", "Петрова", 25, 2100);
        Employer employer3 = new Employer(3, "Пётр", "Петров", 40, 3250);
        Employer employer4 = new Employer(4, "Елена", "Сидорова", 35, 1800);
        Employer employer5 = new Employer(5, "Акакий", "Сидоров", 28, 3120);
        Employer employer6 = new Employer(6, "Мария", "Кузнецова", 32, 2950);
        Employer employer7 = new Employer(7, "Алексей", "Кузнецов", 29, 2640);
        Employer employer8 = new Employer(8, "Федор", "Рыбкин", 27, 2360);

        Map<Employer, String> employerMap = new HashMap<>();
        employerMap.put(employer1, "Копирайтер");
        employerMap.put(employer2, "Дизайнер");
        employerMap.put(employer3, "Менеджер");
        employerMap.put(employer4, "Визажист");
        employerMap.put(employer5, "SMMщик");
        employerMap.put(employer6, "Маркетолог");
        employerMap.put(employer7, "Тестировщик");
        employerMap.put(employer8, "HR");

        System.out.println("Сотрудники до повышения зарплаты:");
        for (Map.Entry<Employer, String> entry : employerMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Профессия: " + entry.getValue());
        }

        raiseSalaryForProfession(employerMap, "Тестировщик", 200);

        System.out.println("\nСотрудники после повышения зарплаты:");
        for (Map.Entry<Employer, String> entry : employerMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Профессия: " + entry.getValue());
        }
    }

    private static void raiseSalaryForProfession(Map<Employer, String> employers, String profession, int amountOfIncrease) {
        for (Map.Entry<Employer, String> entry : employers.entrySet()) {
            if (entry.getValue().equals(profession)) {
                Employer employer = entry.getKey();
                employer.setSalary(employer.getSalary() + amountOfIncrease);
                System.out.println("Повышена зарплата сотруднику: " + employer.getFirstName() + " " + employer.getLastName() +
                        " -> Новая зарплата: " + employer.getSalary());
            }
        }
    }
}