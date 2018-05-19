package edu.chientran98.designpattern.prototype;

/**
 *
 * @author yeula
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape 1: " + clonedShape1.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape 2: " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape 3: " + clonedShape3.getType());
    }
}
