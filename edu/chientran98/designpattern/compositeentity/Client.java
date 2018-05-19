package edu.chientran98.designpattern.compositeentity;

/**
 *
 * @author yeula
 */
public class Client {

    private CompositeObject compositeEntity = new CompositeObject();

    public void printData() {
        for (String string : compositeEntity.getData()) {
            System.out.println("Data: " + string);
        }
    }
    
    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
