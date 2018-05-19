package edu.chientran98.designpattern.servicelocator;

/**
 *
 * @author yeula
 */
public class ServiceLocatorPatternDemo {

    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
