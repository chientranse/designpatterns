package edu.chientran98.designpattern.flyweight;

/**
 *
 * @author yeula
 */
public class Circle implements Shape {

    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    private int radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw()[x: " + x + ", y: " + y + ", radius: " + radius + ", color: " + color + "]");
    }

}
