package pl.edu.pjwstk.mpr.Ex5;

import org.junit.Test;
import pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5.*;

import static org.mockito.Mockito.*;


public class ObserverTest {

    @Test
    public void shouldDispatcherBeCalled() {
        //assume
        var witness = new AccidentWitness();
        var dispatcherMock = mock(Dispatcher.class);
        witness.registerObserver(dispatcherMock);

        //act
        witness.notifyObserver("Something bad happened");
        //assert
        verify(dispatcherMock).update("Something bad happened");
    }

    @Test
    public void shouldAmbulanceBeCalled() {
        //assume
        var witness = new AccidentWitness();
        var dispatcher = new Dispatcher();
        var ambulanceMock = mock(Ambulance.class);
        witness.registerObserver(dispatcher);
        dispatcher.registerObserver(ambulanceMock);

        //act
        witness.notifyObserver("Something bad happened");
        //assert
        verify(ambulanceMock).update("Incident has happened");
    }

    @Test
    public void shouldPoliceBeCalled() {
        //assume
        var witness = new AccidentWitness();
        var dispatcher = new Dispatcher();
        var policeMock = mock(Ambulance.class);
        witness.registerObserver(dispatcher);
        dispatcher.registerObserver(policeMock);

        //act
        witness.notifyObserver("Something bad happened");
        //assert
        verify(policeMock).update("Incident has happened");
    }

    @Test
    public void shouldFireBrigadeBeCalled() {
        //assume
        var witness = new AccidentWitness();
        var dispatcher = new Dispatcher();
        var fireBrigadeMock = mock(Ambulance.class);
        witness.registerObserver(dispatcher);
        dispatcher.registerObserver(fireBrigadeMock);

        //act
        witness.notifyObserver("Something bad happened");
        //assert
        verify(fireBrigadeMock).update("Incident has happened");
    }

    @Test
    public void shouldAmbulanceAcceptWithoutCall() {
        //assume
        var dispatcher = new Dispatcher();
        var ambulanceMock = mock(Ambulance.class);
        dispatcher.registerObserver(ambulanceMock);

        //act

        //assert
        verify(ambulanceMock, times(0)).update("");}

    @Test
    public void shouldPoliceAcceptWithoutCall() {
        //assume
        var dispatcher = new Dispatcher();
        var policeMock = mock(Police.class);
        dispatcher.registerObserver(policeMock);

        //act

        //assert
        verify(policeMock, times(0)).update("");}

    @Test
    public void shouldFireBrigadeAcceptWithoutCall() {
        //assume
        var dispatcher = new Dispatcher();
        var fireBrigadeMock = mock(FireBrigade.class);
        dispatcher.registerObserver(fireBrigadeMock);

        //act

        //assert
        verify(fireBrigadeMock, times(0)).update("");}

    @Test
    public void shouldWitnessCall999ForAmbulance() {
        //assume
        var witness = new AccidentWitness();
        var ambulanceMock = mock(Ambulance.class);
        witness.registerObserver(ambulanceMock);


        //act
        witness.notifyObserver("Something bad happened");
        //assert
        verify(ambulanceMock).update("Something bad happened");
    }



    @Test
    public void shouldWitnessCall997ForPolice() {
        //assume
        var witness = new AccidentWitness();
        var policeMock = mock(Police.class);
        witness.registerObserver(policeMock);


        //act
        witness.notifyObserver("Something bad happened");
        //assert
        verify(policeMock).update("Something bad happened");
    }

    @Test
    public void shouldWitnessCall998ForFireBrigade() {
        //assume
        var witness = new AccidentWitness();
        var fireBrigadeMock = mock(FireBrigade.class);
        witness.registerObserver(fireBrigadeMock);


        //act
        witness.notifyObserver("Something bad happened");
        //assert
        verify(fireBrigadeMock).update("Something bad happened");
    }
}
