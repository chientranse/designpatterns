package edu.chientran98.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeula
 */
public class Subject {

    private List<Observer> observers = new ArrayList();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
    private int state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        observers.stream().forEach((observer) -> observer.update());
    }

}
