package Homework7;

import java.util.ArrayList;

public class Student {
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int averageGrade;

    public Student() {
    }

    public Student(int id, String name, String surname, String faculty, int course, String group, int averageGrade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Faculty: " + faculty);
        System.out.println("Course: " + course);
        System.out.println("Group: " + group);
        System.out.println("Average Grade: " + averageGrade);
    }

    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    public String getGroup() {
        return this.group;
    }

    public void changeParametrs(String newGroup, int newAverageGrade) {
        this.group = newGroup;
        this.averageGrade = newAverageGrade;
    }

       public Student[] getStudents(Student[] students, int mark) {
        ArrayList<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.averageGrade > mark) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents.toArray(new Student[0]);
    }
}