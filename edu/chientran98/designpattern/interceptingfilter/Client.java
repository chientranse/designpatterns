package edu.chientran98.designpattern.interceptingfilter;

/**
 *
 * @author yeula
 */
public class Client {

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }
    FilterManager filterManager;
    
    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }

}
