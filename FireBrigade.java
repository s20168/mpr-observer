package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

public class FireBrigade implements Observer{

    public FireBrigade(){

    }
    @Override
    public void update(String message) {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(FireBrigade.class.getSimpleName() + " received the notification and is on its way.");
    }
}
