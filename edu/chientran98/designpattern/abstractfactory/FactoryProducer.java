package edu.chientran98.designpattern.abstractfactory;

/**
 *
 * @author yeula
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
