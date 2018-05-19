package edu.chientran98.designpattern.frontcontroller;

/**
 *
 * @author yeula
 */
public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;
    private ErrorView errorView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
        errorView = new ErrorView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else if (request.equalsIgnoreCase("HOME")) {
            homeView.show();
        } else {
            errorView.show();
        }
    }
}
