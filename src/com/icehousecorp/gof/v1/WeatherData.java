package com.icehousecorp.gof.v1;

import java.util.ArrayList;

/**
 * Created by mexanjuadha on 1/21/16.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> mObservers;

    private float mTemprature;

    public WeatherData() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int indexObserver = mObservers.indexOf(observer);
        if (indexObserver >= 0) {
            mObservers.remove(indexObserver);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : mObservers) {
            observer.update(mTemprature);
        }
    }

    public void setWeather(float mTemprature) {
        this.mTemprature = mTemprature;
        notifyObserver();
    }
}
