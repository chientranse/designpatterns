package edu.chientran98.designpattern.interpreter;

/**
 *
 * @author yeula
 */
public class InterpreterPatternDemo {
    
    private static Expression getMaleExpresion() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpresion(robert, john);
    }
    
    private static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
    
    public static void main(String[] args) {
        Expression isMale = getMaleExpresion();
        Expression isMarriedWoman = getMarriedWomanExpression();
        
        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Julie"));
    }
}
