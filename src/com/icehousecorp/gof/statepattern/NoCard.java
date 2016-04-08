package com.icehousecorp.gof.statepattern;

import android.util.Log;

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
        Log.d(TAG, "insertCard: card inserted");
        atmMachine.setAtmState(atmMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        Log.d(TAG, "ejectCard: no card inside atm");
    }

    @Override
    public void insertPin(int pin) {
        Log.d(TAG, "Insert card first");
    }

    @Override
    public void requestCash(int cash) {
        Log.d(TAG, "Insert card first");
    }
}
