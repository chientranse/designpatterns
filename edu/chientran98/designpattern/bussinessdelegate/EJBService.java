package edu.chientran98.designpattern.bussinessdelegate;

/**
 *
 * @author yeula
 */
public class EJBService implements BussinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB service");
    }

}
