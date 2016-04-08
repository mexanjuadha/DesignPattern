package com.icehousecorp.gof.v1;

import android.util.Log;

/**
 * Created by mexanjuadha on 1/21/16.
 */
public class DisplayWeather implements Observer, UserInterface {

    private static final String TAG = DisplayWeather.class.getSimpleName();

    private float mTemperature;

    private Subject mWeatherData;

    public DisplayWeather(Subject mWeatherData) {
        this.mWeatherData = mWeatherData;
        mWeatherData.registerObserver(this);
    }

    @Override
    public void update(float temprature) {
        mTemperature = temprature;
        display();
    }

    @Override
    public void display() {
        Log.d(TAG, "display: " + mTemperature);
    }

    public void removeFromObserver(){
        mWeatherData.removeObserver(this);
    }
}
