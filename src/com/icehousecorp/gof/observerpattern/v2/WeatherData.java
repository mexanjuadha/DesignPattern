package com.icehousecorp.gof.observerpattern.v2;

import java.util.Observable;

/**
 * Created by mexanjuadha on 1/21/16.
 */
public class WeatherData extends Observable {

    private float mTemprature;

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurementsChanged(float mTemprature) {
        this.mTemprature = mTemprature;
        measurementsChanged();
    }

    public float getTemprature() {
        return mTemprature;
    }
}
