package edu.chientran98.designpattern.visitor;

/**
 *
 * @author yeula
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);

    public void visit(Keyboard keyboard);

    public void visit(Mouse mouse);

    public void visit(Monitor monitor);
}
