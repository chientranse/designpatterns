package edu.chientran98.designpattern.interceptingfilter;

/**
 *
 * @author yeula
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }

}
