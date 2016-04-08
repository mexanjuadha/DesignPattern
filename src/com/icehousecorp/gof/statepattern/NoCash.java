package com.icehousecorp.gof.statepattern;

/**
 * Created by mexanjuadha on 3/17/16.
 */
public class NoCash implements ATMState {

    private static final String TAG = NoCash.class.getSimpleName();

    private ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println( "insertPin() called with: no money");
    }

    @Override
    public void ejectCard() {
        System.out.println( "insertPin() called with: no money");

    }

    @Override
    public void insertPin(int pin) {
        System.out.println( "insertPin() called with: no money");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println( "requestCash() called with: no money");
    }
}
