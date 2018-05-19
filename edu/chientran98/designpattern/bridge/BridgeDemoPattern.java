package edu.chientran98.designpattern.bridge;

/**
 *
 * @author yeula
 */
public class BridgeDemoPattern {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 100, new RedCircle());
        Shape greenCircle = new Circle(50, 300, 300, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
