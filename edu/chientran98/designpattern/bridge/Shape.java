package edu.chientran98.designpattern.bridge;

/**
 *
 * @author yeula
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
