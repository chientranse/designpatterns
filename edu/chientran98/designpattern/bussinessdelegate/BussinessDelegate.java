package edu.chientran98.designpattern.bussinessdelegate;

/**
 *
 * @author yeula
 */
public class BussinessDelegate {

    private BussinessLookup lookupService = new BussinessLookup();
    private BussinessService bussinessService;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    private String serviceType;

    public void doTask() {
        bussinessService = lookupService.getBussinessService(serviceType);
        bussinessService.doProcessing();
    }

}
