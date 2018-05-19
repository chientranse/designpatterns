package edu.chientran98.designpattern.flyweight;

import java.util.HashMap;

/**
 *
 * @author yeula
 */
public class ShapeFactory {

    private static final HashMap circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }
}
