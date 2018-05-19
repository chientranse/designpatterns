package edu.chientran98.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeula
 */
public class CareTaker {

    private List<Memento> mementoes = new ArrayList<>();

    public void add(Memento memento) {
        mementoes.add(memento);
    }

    public Memento get(int index) {
        return mementoes.get(index);
    }
}
