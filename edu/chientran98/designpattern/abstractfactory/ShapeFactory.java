package edu.chientran98.designpattern.abstractfactory;

/**
 *
 * @author yeula
 */
public class ShapeFactory extends AbstractFactory {

    /**
     *
     * @param shapeType is "RECTANGLE", "SQUARE" OR "CIRCLE"
     * @return a shape in class Rectangle, Square or Circle
     */
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }

}
