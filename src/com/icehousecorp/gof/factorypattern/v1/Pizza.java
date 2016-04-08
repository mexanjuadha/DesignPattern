package com.icehousecorp.gof.factorypattern.v1;

/**
 * Created by mexanjuadha on 2/4/16.
 */
public class Pizza {

    private static final String TAG = Pizza.class.getSimpleName();

    public void prepare() {
        System.out.println("prepare() called with: " + "");
    }

    public void bake() {
        System.out.println("bake() called with: " + "");
    }

    public void cut() {
        System.out.println("cut() called with: " + "");
    }

    public void box() {
        System.out.println("box() called with: " + "");
    }

}
