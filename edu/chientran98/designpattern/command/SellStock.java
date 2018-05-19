package edu.chientran98.designpattern.command;

/**
 *
 * @author yeula
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }

}
