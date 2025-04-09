package Homework13;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String birthCity;
    private double averageGrade;

    public Student(String firstName, String lastName, LocalDate birthDate, String birthCity, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}