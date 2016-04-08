package com.icehousecorp.gof.observerpattern.v1;

/**
 * Created by mexanjuadha on 1/21/16.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
