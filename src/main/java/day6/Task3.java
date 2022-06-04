package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Jack Johnson", "Math");
        Student student = new Student("Barry White");
        teacher.getTeacherName();
        student.getStudentName();
        teacher.getSubject();

        teacher.evaluate(student);

    }
}

