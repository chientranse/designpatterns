package edu.chientran98.designpattern.visitor;

/**
 *
 * @author yeula
 */
public class VisitorPatternDemo {
    
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
