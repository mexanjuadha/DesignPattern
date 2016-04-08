package com.icehousecorp.gof.statepattern;

/**
 * Created by mexanjuadha on 3/17/16.
 */
public class ATMAction {


    public static void atmAction(){
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.insertPin(12345);
        atmMachine.requestCash(100);
        atmMachine.ejectCard();
        atmMachine.insertPin(1234);
    }
}
