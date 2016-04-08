package com.icehousecorp.gof.statepattern;

/**
 * Created by mexanjuadha on 3/17/16.
 */
public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pin);

    void requestCash(int cash);

}
