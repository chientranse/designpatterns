package edu.chientran98.designpattern.visitor;

/**
 *
 * @author yeula
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
