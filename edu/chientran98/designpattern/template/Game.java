package edu.chientran98.designpattern.template;

/**
 *
 * @author yeula
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initialize();

        startPlay();

        endPlay();
    }
}
