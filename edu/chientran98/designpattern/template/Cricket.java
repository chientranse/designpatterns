package edu.chientran98.designpattern.template;

/**
 *
 * @author yeula
 */
public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Cricket Game initizlied");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game playing");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game end");
    }

}
