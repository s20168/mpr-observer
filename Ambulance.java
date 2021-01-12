package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

public class Ambulance implements Observer{

    public Ambulance(){

    }
    @Override
    public void update(String message) {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(Ambulance.class.getSimpleName() + " received the notification and is on its way.");
    }
}
