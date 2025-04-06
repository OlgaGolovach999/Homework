package Homework14;

import java.util.Objects;

public class Patient {
    public enum Gender {
        МУЖСКОЙ,
        ЖЕНСКИЙ;
    }

    private String id;
    private String firstName;
    private String lastName;
    private String diagnosis;
    private int age;
    private Gender gender;

    public Patient(String id, String firstName, String lastName, String diagnosis, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age &&
                Objects.equals(firstName, patient.firstName) &&
                Objects.equals(lastName, patient.lastName) &&
                Objects.equals(diagnosis, patient.diagnosis) &&
                gender == patient.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, diagnosis, age, gender);
    }
}