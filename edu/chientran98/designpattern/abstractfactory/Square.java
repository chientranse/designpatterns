package edu.chientran98.designpattern.abstractfactory;

/**
 *
 * @author yeula
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }

}
