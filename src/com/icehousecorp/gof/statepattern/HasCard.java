package com.icehousecorp.gof.statepattern;

/**
 * Created by mexanjuadha on 3/17/16.
 */
public class HasCard implements ATMState {

    private static final String TAG = HasCard.class.getSimpleName();

    private ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println( "insertCard: Already insert card");
    }

    @Override
    public void ejectCard() {
        System.out.println( "ejectCard() called with: card ejected");
        atmMachine.setAtmState(atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int pin) {
        if (atmMachine.pin == pin) {
            System.out.println( "insertPin: pin valid");
            atmMachine.setAtmState(atmMachine.getHasPin());
        } else {
            System.out.println( "insertPin: wrong pin card ejected");
            atmMachine.setAtmState(atmMachine.getNoCard());
        }
    }

    @Override
    public void requestCash(int cash) {
        System.out.println( "requestCash: Yo must entered pin");
    }
}
