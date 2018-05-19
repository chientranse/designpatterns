package edu.chientran98.designpattern.interpreter;

/**
 *
 * @author yeula
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }

}
