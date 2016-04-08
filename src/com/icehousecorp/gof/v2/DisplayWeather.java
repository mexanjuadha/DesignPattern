package com.icehousecorp.gof.v2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by mexanjuadha on 1/21/16.
 */
public class DisplayWeather implements Observer, UserInterface {

    private static final String TAG = DisplayWeather.class.getSimpleName();

    private float mTemperature;

    private Observable mObservable;

    public DisplayWeather(Observable mObservable) {
        this.mObservable = mObservable;
        mObservable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println( "display: " + mTemperature);
    }

    public void removeFromObserver() {
        mObservable.deleteObserver(this);
    }

    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof WeatherData) {
            WeatherData mWeatherData = (WeatherData) observable;
            this.mTemperature = mWeatherData.getTemprature();
            display();
        }
    }
}
