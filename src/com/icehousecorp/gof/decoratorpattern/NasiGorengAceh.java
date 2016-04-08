package com.icehousecorp.gof.decoratorpattern;

/**
 * Created by mexanjuadha on 1/28/16.
 */
public class NasiGorengAceh extends MenuUtama {

    private static final double COST = 12000;

    private static final String TAG = NasiGorengAceh.class.getSimpleName() ;

    public NasiGorengAceh() {
        description = "Nasi Goreng Aceh";
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
