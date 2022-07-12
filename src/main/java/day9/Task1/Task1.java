package day9.Task1;

public class Task1 {
    public static void main(String[] args) {


        Student student = new Student("Василий", "945");

        System.out.println(student.getGroupName());
        student.printInfo();

        Teacher teacher = new Teacher("Иван Петрович", "Матанализ");
        System.out.println(teacher.getSubjectName());
        teacher.printInfo();
    }
}
