package edu.chientran98.designpattern.interpreter;

/**
 *
 * @author yeula
 */
public class OrExpresion implements Expression {

    private Expression expression1;
    private Expression expression2;

    public OrExpresion(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }

}
