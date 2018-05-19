package edu.chientran98.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeula
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void addEmployee(Employee employee) {
        subordinates.add(employee);
    }

    public void removeEmployee(Employee employee) {
        subordinates.remove(employee);
    }

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Employee[name: " + name + ", dept: " + dept + ", salary: " + salary + "]";
    }

}
