package edu.chientran98.designpattern.mediator;

/**
 *
 * @author yeula
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        
        robert.sendMessage("Hello John!");
        john.sendMessage("Hi Robert!");
    }
}
