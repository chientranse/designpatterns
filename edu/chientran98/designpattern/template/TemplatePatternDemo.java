package edu.chientran98.designpattern.template;

/**
 *
 * @author yeula
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }
}
