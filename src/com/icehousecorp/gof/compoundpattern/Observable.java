package com.icehousecorp.gof.compoundpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mexanjuadha on 3/31/16.
 */
public class Observable implements TukangObervable {

    ArrayList<Observer> arrayObserver = new ArrayList<>();

    TukangObervable tukangObervable;

    public Observable(TukangObervable tukangObervable) {
        this.tukangObervable = tukangObervable;
    }

    @Override
    public void registerObserver(Observer observer) {
        arrayObserver.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = arrayObserver.iterator();

        while (iterator.hasNext()){
            Observer observer = (Observer) iterator;
            observer.update(tukangObervable);
        }
    }
}
