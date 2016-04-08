package com.icehousecorp.gof.strategypattern;

/**
 * Created by mexanjuadha on 4/8/16.
 */
public class NotCoding implements Code {
    @Override
    public void doCoding() {
        System.out.println("I can't coding");
    }
}
