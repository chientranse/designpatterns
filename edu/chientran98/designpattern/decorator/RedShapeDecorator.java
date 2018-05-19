package edu.chientran98.designpattern.decorator;

/**
 *
 * @author yeula
 */
public class RedShapeDecorator extends ShapeDecorator {
    
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    
    @Override
    public void draw() {
        super.draw(); //To change body of generated methods, choose Tools | Templates.
        setRedBorder(decoratedShape);
    }
    
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color: red");
    }
    
}
