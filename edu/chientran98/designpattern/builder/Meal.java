package edu.chientran98.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeula
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        return items.stream().map((item) -> item.price()).reduce(0.0f, (a, b) -> a + b);
    }

    public void showItems() {
        items.stream().forEach((item) -> {
            System.out.println("Item: " + item.name());
            System.out.println(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        });
    }
}
