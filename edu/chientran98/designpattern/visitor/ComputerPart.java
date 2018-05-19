package edu.chientran98.designpattern.visitor;

/**
 *
 * @author yeula
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
