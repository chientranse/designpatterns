package edu.chientran98.designpattern.visitor;

/**
 *
 * @author yeula
 */
public class Computer implements ComputerPart {

    ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[]{new Mouse(), new Monitor(), new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

}
