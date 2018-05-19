package edu.chientran98.designpattern.abstractfactory;

/**
 *
 * @author yeula
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
