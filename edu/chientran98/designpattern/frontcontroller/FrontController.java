package edu.chientran98.designpattern.frontcontroller;

/**
 *
 * @author yeula
 */
public class FrontController {
private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }
    
    private boolean isAuthenticated() {
        System.out.println("User is authenticated successfully");
        return true;
    }
    
    public void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }
    
    public void dispatchRequest(String request) {
        trackRequest(request);
        if (isAuthenticated())
            dispatcher.dispatch(request);
    }

}
