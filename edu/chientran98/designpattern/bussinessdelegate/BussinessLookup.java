package edu.chientran98.designpattern.bussinessdelegate;

/**
 *
 * @author yeula
 */
public class BussinessLookup {

    public BussinessService getBussinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else if (serviceType.equalsIgnoreCase("JMS")) {
            return new JMSService();
        }
        return null;
    }
}
