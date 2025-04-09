package Homework13;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Group {
    private String groupNumber;
    private List<Student> students;

    public Group(String groupNumber, List<Student> students) {
        this.groupNumber = groupNumber;
        this.students = students;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void removeStudentsByMark(int mark) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < mark) {
                iterator.remove();
            }
        }
    }

    public void transferToGroup(Group newGroup) {
        if (this.students.size() < 2) {
            if (newGroup.getStudents() == null) {
                newGroup.setStudents(new ArrayList<>());
            }

            newGroup.getStudents().addAll(this.students);

            this.students.clear();

            System.out.println("Студенты успешно переведены из группы " + this.groupNumber + " в группу " + newGroup.getGroupNumber());
        } else {
            System.out.println("В группе " + this.groupNumber + " достаточно студентов, перенос не требуется.");
        }
    }

    public double calculateAverageGrade() {
        if (students == null || students.isEmpty()) {
            System.out.println("В группе " + groupNumber + " нет студентов! Средний балл не может быть вычислен.");
            return 0.0;
        }

        double totalGrade = 0.0;
        for (Student student : students) {
            totalGrade += student.getAverageGrade();
        }
        return totalGrade / students.size();
    }
}