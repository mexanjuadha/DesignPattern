package com.icehousecorp.gof.statepattern;

import android.util.Log;

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
        Log.d(TAG, "insertPin() called with: no money");
    }

    @Override
    public void ejectCard() {
        Log.d(TAG, "insertPin() called with: no money");

    }

    @Override
    public void insertPin(int pin) {
        Log.d(TAG, "insertPin() called with: no money");
    }

    @Override
    public void requestCash(int cash) {
        Log.d(TAG, "requestCash() called with: no money");
    }
}
