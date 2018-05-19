package edu.chientran98.designpattern.nullobject;

/**
 *
 * @author yeula
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in Customer database";
    }

}
