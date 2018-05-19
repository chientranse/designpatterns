package edu.chientran98.designpattern.frontcontroller;

/**
 *
 * @author yeula
 */
public class FrontControllerPatternDemo {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
        frontController.dispatchRequest("TEACHER");
    }
}
