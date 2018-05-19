package edu.chientran98.designpattern.flyweight;

/**
 *
 * @author yeula
 */
public class FlyweightPatternDemo {

    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colors[i % 5]);
            circle.setX(i * 50);
            circle.setY(i * 100);
            circle.setRadius(i * 10);
            circle.draw();
        }
    }
}
