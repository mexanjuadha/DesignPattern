package com.icehousecorp.gof.decoratorpattern;

/**
 * Created by mexanjuadha on 1/28/16.
 */
public class NasiGorengBetawi extends MenuUtama {

    private static final double COST = 10000;

    private static final String TAG = NasiGorengBetawi.class.getSimpleName() ;

    public NasiGorengBetawi() {
        description = "Nasi Goreng Betawi";
    }

    @Override
    public void getOrder() {
        System.out.println("getOrder: " + description + ", Cost" + COST);
    }

    @Override
    protected double getCost() {
        return COST;
    }

}
