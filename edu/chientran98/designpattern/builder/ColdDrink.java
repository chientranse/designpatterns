package edu.chientran98.designpattern.builder;

/**
 *
 * @author yeula
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
