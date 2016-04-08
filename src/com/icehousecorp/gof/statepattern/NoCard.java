package com.icehousecorp.gof.statepattern;


/**
 * Created by mexanjuadha on 3/17/16.
 */
public class NoCard implements ATMState {

    private static final String TAG = NoCard.class.getSimpleName();

    private ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println( "insertCard: card inserted");
        atmMachine.setAtmState(atmMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println( "ejectCard: no card inside atm");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println( "Insert card first");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println( "Insert card first");
    }
}
