package edu.chientran98.designpattern.transferobject;

/**
 *
 * @author yeula
 */
public class TransferObjectPatternDemo {

    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();

        studentBO.getAllStudents().forEach((student) -> {
            System.out.println("Student[rollNo: " + student.getRollNo() + ", name: " + student.getName() + "]");
        });

        StudentVO student = studentBO.getAllStudents().get(0);
        student.setName("Michael");
        studentBO.updateStudent(student);

        student = studentBO.getStudent(0);
        System.out.println("Student[rollNo: " + student.getRollNo() + ", name: " + student.getName() + "]");
    }
}
