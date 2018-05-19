package edu.chientran98.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeula
 */
public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        orders.stream().forEach((order) -> order.execute());
        orders.clear();
    }
}
