package Homework7;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 123;
        student1.name = "Ольга";
        student1.surname = "Головач";
        student1.faculty = "Математики";
        student1.course = 2;
        student1.group = "M2";
        student1.averageGrade = 8;

        Student student2 = new Student(77, "Варвара", "Филатова", "Информатики", 1, "И1", 9);

        student1.info();
        student2.info();

        System.out.println("*******************");

        student1.changeGroup("Mnew");
        System.out.println("После изменения название группы: " + student1.group);
        student2.changeGroup("И3");
        System.out.println("После изменения название группы: " + student2.group);

        System.out.println("*******************");

        student1.getGroup();
        System.out.println("Текущая группа: " + student1.getGroup());
        student2.getGroup();
        System.out.println("Текущая группа: " + student2.getGroup());

        System.out.println("*******************");

        student1.changeParametrs("M11", 9);
        System.out.println("После изменения группа = " + student1.group + "; оценка = " + student1.averageGrade);
        student2.changeParametrs("И4", 10);
        System.out.println("После изменения группа = " + student2.group + "; оценка = " + student2.averageGrade);

        System.out.println("*******************");

        Student[] students = new Student[5];
        students[0] = new Student(1, "София", "Иванова", "Экономики", 3, "Э1", 7);
        students[1] = new Student(2, "Мария", "Петрова", "Физкультуры", 2, "Ф2", 9);
        students[2] = new Student(3, "Алла", "Сидорова", "Физики", 1, "Ф3", 8);
        students[3] = new Student(4, "Екатерина", "Смирнова", "Биологии", 4, "Б1", 8);
        students[4] = new Student(5, "Юлия", "Кузнецова", "Химии", 3, "Х2", 6);

        Student[] highMarkStudents = Student.getStudents(students, 7);
        System.out.println("Студенты с оценками выше 7:");
        for (Student student : highMarkStudents) {
            student.info();
            System.out.println();
        }
    }
}