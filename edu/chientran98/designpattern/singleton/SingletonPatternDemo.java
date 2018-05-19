package edu.chientran98.designpattern.singleton;

/**
 *
 * @author yeula
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingletonObject object = SingletonObject.getInstance();
        object.showMessage();
    }
}
