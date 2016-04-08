package com.icehousecorp.gof.statepattern;

import android.util.Log;

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
        Log.d(TAG, "insertCard: Already insert card");
    }

    @Override
    public void ejectCard() {
        Log.d(TAG, "ejectCard() called with: card ejected");
        atmMachine.setAtmState(atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int pin) {
        if (atmMachine.pin == pin) {
            Log.d(TAG, "insertPin: pin valid");
            atmMachine.setAtmState(atmMachine.getHasPin());
        } else {
            Log.d(TAG, "insertPin: wrong pin card ejected");
            atmMachine.setAtmState(atmMachine.getNoCard());
        }
    }

    @Override
    public void requestCash(int cash) {
        Log.d(TAG, "requestCash: Yo must entered pin");
    }
}
