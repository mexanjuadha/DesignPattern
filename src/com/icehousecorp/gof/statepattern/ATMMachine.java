package com.icehousecorp.gof.statepattern;

/**
 * Created by mexanjuadha on 3/17/16.
 */
public class ATMMachine {

    public int moneyOnMachine = 200;

    public int pin = 12345;

    public ATMState hasPin;

    public ATMState noCash;

    public ATMState atmState;

    public ATMState noCard;

    public ATMState hasCard;

    public ATMMachine() {
        this.hasPin = new HasPin(this);
        this.noCash = new NoCash(this);
        this.noCard = new NoCard(this);
        this.hasCard = new HasCard(this);

        atmState = noCard;

        if (moneyOnMachine < 0) {
            atmState = noCash;
        }
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void setMoneyOnMachine(int moneyOnMachine) {
        this.moneyOnMachine = moneyOnMachine;
    }

    public void requestCash(int cash) {
        atmState.requestCash(cash);
    }

    public void insertPin(int pin) {
        atmState.insertPin(pin);
    }

    public void insertCard(){
        atmState.insertCard();
    }

    public void ejectCard(){
        atmState.ejectCard();
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public ATMState getNoCash() {
        return noCash;
    }

    public ATMState getHasPin() {
        return hasPin;
    }

    public int getMoneyOnMachine() {
        return moneyOnMachine;
    }

    public ATMState getHasCard() {
        return hasCard;
    }
}
