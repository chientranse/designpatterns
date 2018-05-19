package edu.chientran98.designpattern.bussinessdelegate;

/**
 *
 * @author yeula
 */
public class Client {

    BussinessDelegate bussinessService;

    public Client(BussinessDelegate bussinessService) {
        this.bussinessService = bussinessService;
    }

    public void doTask() {
        bussinessService.doTask();
    }
}
