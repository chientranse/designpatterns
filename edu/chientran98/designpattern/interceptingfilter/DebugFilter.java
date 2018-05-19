package edu.chientran98.designpattern.interceptingfilter;

/**
 *
 * @author yeula
 */
public class DebugFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }

}
