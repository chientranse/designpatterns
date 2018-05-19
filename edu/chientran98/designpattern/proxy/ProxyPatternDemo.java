package edu.chientran98.designpattern.proxy;

/**
 *
 * @author yeula
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}
