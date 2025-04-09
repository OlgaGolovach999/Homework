package Homework15;

import java.util.Objects;

public class Employer {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employer(int id, String firstName, String lastName, int age, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return id == employer.id &&
                age == employer.age &&
                Double.compare(employer.salary, salary) == 0 &&
                Objects.equals(firstName, employer.firstName) &&
                Objects.equals(lastName, employer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, salary);
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "ID=" + id +
                ", Имя='" + firstName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Возраст=" + age +
                ", Зарплата=" + salary +
                '}';
    }
}