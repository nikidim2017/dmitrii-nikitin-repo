package day6;

import java.util.Random;

public class Teacher {

    private String teacherName;
    private String subject;
    private String grade;


    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setGrade(){
        this.grade = grade;
    }


    void evaluate(Student student) {

        int num = (int) (2 + Math.random() * 4);

        switch (num) {

            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
        }
        System.out.println("Преподаватель " + getTeacherName() + " " + "оценил студента с именем " + student.getStudentName() + " " + "по предмету " + " " + getSubject() + " " + "на оценку " + grade);
    }
}
