package edu.chientran98.designpattern.mvc;

/**
 *
 * @author yeula
 */
public class MVCPatternDemo {

    public static void main(String[] args) {
        Student model = new Student();
        model.setName("Chien Tran");
        model.setRollNo("admin");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        model.setRollNo("moderator");

        controller.updateView();

    }
}
