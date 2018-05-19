package edu.chientran98.designpattern.nullobject;

/**
 *
 * @author yeula
 */
public class CustomerFactory {

    private static final String[] names = {"Bobs", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String name1 : names) {
            if (name1.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
