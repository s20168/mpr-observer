package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

import java.util.ArrayList;
import java.util.List;

public class AccidentWitness implements Observable {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers) {
           // message = "Something bad happend";
            observer.update(message);
        }
    }

}