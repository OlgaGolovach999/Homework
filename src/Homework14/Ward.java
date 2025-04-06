package Homework14;

import java.util.ArrayList;
import java.util.List;

public class Ward {
    public enum WardType {
        МУЖСКАЯ,
        ЖЕНСКАЯ
    }

    private String wardNumber;
    private WardType wardType;
    private List<Patient> patients;

    public Ward(String wardNumber, WardType wardType) {
        this.wardNumber = wardNumber;
        this.wardType = wardType;
        this.patients = new ArrayList<>(); // Инициализация списка пациентов
    }

    public String getWardNumber() {
        return wardNumber;
    }

    public WardType getWardType() {
        return wardType;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setWardNumber(String wardNumber) {
        this.wardNumber = wardNumber;
    }

    public void setWardType(WardType wardType) {
        this.wardType = wardType;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public boolean addPatient(Patient patient) {
        if (patients.size() >= 3) {
            System.out.println("Палата " + wardNumber + " уже заполнена.");
            return false;
        }
        if (patients.contains(patient)) {
            System.out.println("Такой пациент уже существует в палате " + wardNumber);
            return false;
        }
        patients.add(patient);
        return true;
    }

    public boolean addPatientByDiagnosis(Patient patient) {
        if (patients.isEmpty()) {
            patients.add(patient);
            System.out.println("Пациент добавлен в палату " + wardNumber + " как первый.");
            return true;
        }

        String diagnosis = patients.get(0).getDiagnosis();
        if (diagnosis.equals(patient.getDiagnosis())) {
            patients.add(patient);
            System.out.println("Пациент добавлен в палату " + wardNumber + ".");
            return true;
        } else {
            System.out.println("Диагноз пациента не совпадает с диагнозами в палате " + wardNumber + ".");
            return false;
        }
    }

    public void printAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("В палате " + wardNumber + " нет пациентов.");
            return;
        }

        System.out.println("Пациенты в палате " + wardNumber + " (" + wardType + "):");
        for (Patient patient : patients) {
            System.out.println("- Имя: " + patient.getFirstName() + " " + patient.getLastName() +
                    ", Возраст: " + patient.getAge() +
                    ", Пол: " + patient.getGender() +
                    ", Диагноз: " + patient.getDiagnosis());
        }
    }
}