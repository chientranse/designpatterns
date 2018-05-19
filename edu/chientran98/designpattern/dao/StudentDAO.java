package edu.chientran98.designpattern.dao;

import java.util.List;

/**
 *
 * @author yeula
 */
public interface StudentDAO {

    public List<Student> getStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
