package edu.chientran98.designpattern.strategy;

/**
 *
 * @author yeula
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }

}
