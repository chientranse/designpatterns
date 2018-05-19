package edu.chientran98.designpattern.abstractfactory;

/**
 *
 * @author yeula
 */
public class ColorFactory extends AbstractFactory {

    /**
     *
     * @param color is "RED", "GREEN" or "BLUE"
     * @return a new color filler in class Red, Green or Blue
     */
    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }

}
