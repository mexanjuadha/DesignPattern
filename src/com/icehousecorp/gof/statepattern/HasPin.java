package com.icehousecorp.gof.statepattern;

import android.util.Log;

/**
 * Created by mexanjuadha on 3/17/16.
 */
public class HasPin implements ATMState {

    private static final String TAG = HasPin.class.getSimpleName();

    private ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        Log.d(TAG, "insertCard: you already inserted card");
    }

    @Override
    public void ejectCard() {
        Log.d(TAG, "ejectCard: card ejected");
        atmMachine.setAtmState(atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int pin) {
        Log.d(TAG, "insertPin() called with: you already entered pin");
    }

    @Override
    public void requestCash(int cash) {
        if (cash < atmMachine.moneyOnMachine) {
            atmMachine.setMoneyOnMachine(atmMachine.moneyOnMachine - cash);
            Log.d(TAG, "requestCash: " + cash);
            if (atmMachine.moneyOnMachine <= 0) {
                atmMachine.setAtmState(atmMachine.noCash);
            }
        } else {
            Log.d(TAG, "requestCash() no money");
            atmMachine.setAtmState(atmMachine.noCash);

        }
    }
}
