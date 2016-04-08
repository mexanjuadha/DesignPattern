package com.icehousecorp.gof.compoundpattern;

/**
 * Created by mexanjuadha on 3/31/16.
 */
public class TukangCukur implements TukangPotong {

    Observable observable;

    public TukangCukur() {
        observable = new Observable(this);
    }

    @Override
    public void cukur() {
        System.out.println("Cukur kebun");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
