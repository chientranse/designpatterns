package edu.chientran98.designpattern.template;

/**
 *
 * @author yeula
 */
public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("Football Game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game playing");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game end");
    }

}
