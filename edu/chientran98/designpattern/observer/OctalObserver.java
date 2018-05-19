package edu.chientran98.designpattern.observer;

/**
 *
 * @author yeula
 */
public class OctalObserver extends Observer {
    
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
    
}
