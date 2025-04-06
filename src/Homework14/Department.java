package Homework14;

import java.util.Set;

public class Department {
    private String departmentName;
    private Set<Ward> wards;

    public Department(String departmentName, Set<Ward> wards) {
        this.departmentName = departmentName;
        this.wards = wards;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setWards(Set<Ward> wards) {
        this.wards = wards;
    }

    public void addWard(Ward ward) {
        wards.add(ward);
    }

    public void countPatientsByGender() {
        int maleCount = 0;
        int femaleCount = 0;

        for (Ward ward : wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getGender() == Patient.Gender.МУЖСКОЙ) {
                    maleCount++;
                } else if (patient.getGender() == Patient.Gender.ЖЕНСКИЙ) {
                    femaleCount++;
                }
            }
        }

        System.out.println("Количество мужчин в отделении: " + maleCount);
        System.out.println("Количество женщин в отделении: " + femaleCount);
    }
}