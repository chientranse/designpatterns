package edu.chientran98.designpattern.servicelocator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeula
 */
public class Cache {

    private List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service service) {
        for (Service service1 : services) {
            if (service1.getName().equalsIgnoreCase(service.getName())) {
                return;
            }
        }
        services.add(service);
    }
}
