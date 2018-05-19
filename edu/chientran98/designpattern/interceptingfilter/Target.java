package edu.chientran98.designpattern.interceptingfilter;

/**
 *
 * @author yeula
 */
public class Target {

    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
