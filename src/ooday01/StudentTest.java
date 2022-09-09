package ooday01;
import ooday01.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.sayHi();

        System.out.println("\n---------赋值");

        student.name="cikho";
        student.age=24;
        student.address="广州";

        student.sayHi();

    }
}
