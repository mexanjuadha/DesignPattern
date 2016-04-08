package com.icehousecorp.gof.compoundpattern;


/**
 * Created by mexanjuadha on 3/31/16.
 */
public interface TukangObervable {

    void registerObserver(Observer observer);

    void notifyObservers();


}
