package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

public interface Observable {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(String message);

}
