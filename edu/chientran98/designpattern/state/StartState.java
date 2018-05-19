package edu.chientran98.designpattern.state;

/**
 *
 * @author yeula
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start mode");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state";
    }

}
