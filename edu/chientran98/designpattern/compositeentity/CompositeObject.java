package edu.chientran98.designpattern.compositeentity;

/**
 *
 * @author yeula
 */
public class CompositeObject {

    private CoarseGrainedObject object = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        object.setData(data1, data2);
    }

    public String[] getData() {
        return object.getData();
    }
}
