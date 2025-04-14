package Homework14;

import java.util.HashSet;

public class MainClass {
    public static void main(String[] args) {

        Patient patient1 = new Patient("123", "Иван", "Иванов", "Грипп", 35, Patient.Gender.МУЖСКОЙ);
        Patient patient2 = new Patient("124", "Анна", "Смирнова", "Бронхит", 28, Patient.Gender.ЖЕНСКИЙ);
        Patient duplicatePatient = new Patient("125", "Иван", "Иванов", "Грипп", 35, Patient.Gender.МУЖСКОЙ);

        Ward ward1 = new Ward("101", Ward.WardType.МУЖСКАЯ);
        Ward ward2 = new Ward("102", Ward.WardType.ЖЕНСКАЯ);

        System.out.println("\nДобавление пациентов в палату 101:");
        ward1.addPatientByDiagnosis(patient1);
        ward1.addPatientByDiagnosis(patient2);
        ward1.addPatientByDiagnosis(duplicatePatient);

        System.out.println("\nДобавление пациентов в палату 102:");
        ward2.addPatientByDiagnosis(patient2);
        ward2.addPatientByDiagnosis(patient1);

        Department department = new Department("Терапевтическое", new HashSet<>());
        department.addWard(ward1);
        department.addWard(ward2);

        System.out.println("\nОтделение: " + department.getDepartmentName());
        for (Ward ward : department.getWards()) {
            System.out.println("Палата: " + ward.getWardNumber() + " (" + ward.getWardType() + ")");
            ward.printAllPatients();
        }

        System.out.println();
        department.countPatientsByGender();
    }
}