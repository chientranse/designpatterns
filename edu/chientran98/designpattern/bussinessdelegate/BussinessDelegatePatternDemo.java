package edu.chientran98.designpattern.bussinessdelegate;

/**
 *
 * @author yeula
 */
public class BussinessDelegatePatternDemo {

    public static void main(String[] args) {
        BussinessDelegate bussinessDelegate = new BussinessDelegate();
        bussinessDelegate.setServiceType("EJB");

        Client client = new Client(bussinessDelegate);
        client.doTask();

        bussinessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
