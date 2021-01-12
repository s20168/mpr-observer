package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

public class Police implements Observer{

    public Police(){

    }
    @Override
    public void update(String message) {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(Police.class.getSimpleName() + " received the notification and is on its way.");
    }
}
