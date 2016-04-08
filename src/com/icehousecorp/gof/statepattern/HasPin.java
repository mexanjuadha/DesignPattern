package com.icehousecorp.gof.statepattern;


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
        System.out.println( "insertCard: you already inserted card");
    }

    @Override
    public void ejectCard() {
        System.out.println( "ejectCard: card ejected");
        atmMachine.setAtmState(atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int pin) {
        System.out.println( "insertPin() called with: you already entered pin");
    }

    @Override
    public void requestCash(int cash) {
        if (cash < atmMachine.moneyOnMachine) {
            atmMachine.setMoneyOnMachine(atmMachine.moneyOnMachine - cash);
            System.out.println( "requestCash: " + cash);
            if (atmMachine.moneyOnMachine <= 0) {
                atmMachine.setAtmState(atmMachine.noCash);
            }
        } else {
            System.out.println( "requestCash() no money");
            atmMachine.setAtmState(atmMachine.noCash);

        }
    }
}
