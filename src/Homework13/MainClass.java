package Homework13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", LocalDate.of(2005, 5, 25), "Грдно", 9);
        Student student2 = new Student("Пётр", "Петров", LocalDate.of(2006, 7, 15), "Витбск", 8);
        Student student3 = new Student("Семён", "Семёнов", LocalDate.of(2004, 8, 10), "Брст", 9);
        Student student4 = new Student("Фридрих", "Сидоров", LocalDate.of(2003, 11, 11), "Гомель", 7);
        Student student5 = new Student("Амур", "Козлов", LocalDate.of(2007, 9, 15), "Орша", 8);

        List<Student> group1Students = new ArrayList<>();
        group1Students.add(student1);

        List<Student> group2Students = new ArrayList<>();
        group2Students.add(student2);
        group2Students.add(student3);
        group2Students.add(student4);
        group2Students.add(student5);

        Group group1 = new Group("101", group1Students);
        Group group2 = new Group("102", group2Students);

        List<Group> facultyGroups = new ArrayList<>();
        facultyGroups.add(group1);
        facultyGroups.add(group2);

        Faculty faculty = new Faculty("Факультет информатики", facultyGroups);
        System.out.println("Факультет: " + faculty.getFacultyName());
        for (Group group : faculty.getGroups()) {
            System.out.println("Группа: " + group.getGroupNumber());
            for (Student student : group.getStudents()) {
                System.out.println("- " + student.getFirstName() + " " + student.getLastName());
            }
            group.removeStudentsByMark(8);

            System.out.println("\nСтуденты после удаления:");
            for (Student student : group.getStudents()) {
                System.out.println(student.getFirstName() + " " + student.getLastName() + " - Средний балл: " + student.getAverageGrade());
            }
        }

        System.out.println("\nДо переноса:");
        System.out.println("Группа " + group1.getGroupNumber() + " содержит " + group1.getStudents().size() + " студент(ов)");
        System.out.println("Группа " + group2.getGroupNumber() + " содержит " + group2.getStudents().size() + " студент(ов)");

        group1.transferToGroup(group2);

        System.out.println("\nПосле переноса:");
        System.out.println("Группа " + group1.getGroupNumber() + " содержит " + group1.getStudents().size() + " студент(ов)");
        System.out.println("Группа " + group2.getGroupNumber() + " содержит " + group2.getStudents().size() + " студент(ов)");

        System.out.println("\nСредний балл по группам:");
        System.out.println("Средний балл по группе " + group1.getGroupNumber() + ": " + group1.calculateAverageGrade());
        System.out.println("Средний балл по группе " + group2.getGroupNumber() + ": " + group2.calculateAverageGrade());
    }
}