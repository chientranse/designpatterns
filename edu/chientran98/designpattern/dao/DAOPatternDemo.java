package edu.chientran98.designpattern.dao;

/**
 *
 * @author yeula
 */
public class DAOPatternDemo {

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImplement();
        studentDAO.getStudents().forEach((student) -> {
            System.out.println("Student [rollno: " + student.getRollNo() + ", name: " + student.getName() + "]");
        });

        Student student = studentDAO.getStudents().get(0);
        student.setName("Michael");
        studentDAO.updateStudent(student);
    }
}
