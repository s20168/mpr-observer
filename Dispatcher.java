package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher implements Observable, Observer {
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

            observer.update(message);
        }
    }

    public void redirectCall(){
        String message = "Incident has happened";
        notifyObserver(message);

    }

    @Override
    public void update(String message) {
        message = "Rescue got the call, redirecting to proper services";
      // System.out.println("Rescue got the call, redirecting to proper services");
        redirectCall();
    }
}