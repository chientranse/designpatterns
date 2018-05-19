package edu.chientran98.designpattern.observer;

/**
 *
 * @author yeula
 */
public class ObserverPatternDemo {
    
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 25");
        subject.setState(25);
    }
}
