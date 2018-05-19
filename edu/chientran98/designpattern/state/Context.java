package edu.chientran98.designpattern.state;

/**
 *
 * @author yeula
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Context() {
        state = null;
    }

}
