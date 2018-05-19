package edu.chientran98.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeula
 */
public class StudentDAOImplement implements StudentDAO {

    List<Student> students;

    @Override
    public List<Student> getStudents() {
        students = new ArrayList<>();
        Student student1 = new Student("Chien Tran", 0);
        Student student2 = new Student("Tran Chien", 1);
        students.add(student1);
        students.add(student2);
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated with name: " + student.getName());
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted");
    }

}
