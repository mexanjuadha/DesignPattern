package com.icehousecorp.gof.decoratorpattern;

/**
 * Created by mexanjuadha on 1/28/16.
 */
public class Sosis extends ToppingExtra {

    private static final String TAG = Sosis.class.getSimpleName();

    private MenuUtama menuUtama;

    public Sosis(MenuUtama menuUtama) {
        this.menuUtama = menuUtama;
    }

    @Override
    public String getDescription() {
        return menuUtama.getDescription() + " Topping Sosis";
    }

    @Override
    public void getOrder() {
        System.out.println("getOrder: " + getDescription() + ", Cost" + getCost());
    }

    @Override
    protected double getCost() {
        return menuUtama.getCost() + 1500;
    }


}
