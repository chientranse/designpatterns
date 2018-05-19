package edu.chientran98.designpattern.prototype;

/**
 *
 * @author yeula
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }

}
