package com.icehousecorp.gof.decoratorpattern;


/**
 * Created by mexanjuadha on 1/28/16.
 */
public class BasoGoreng extends ToppingExtra {

    private static final String TAG = BasoGoreng.class.getSimpleName();

    private MenuUtama menuUtama;

    public BasoGoreng(MenuUtama menuUtama) {
        this.menuUtama = menuUtama;
    }

    @Override
    public String getDescription() {
        return menuUtama.getDescription() + " Topping Baso Goreng";
    }

    @Override
    public void getOrder() {
        System.out.println("getOrder: " + getDescription() + ", Cost " + getCost());
    }

    @Override
    protected double getCost() {
        return menuUtama.getCost() + 1500;
    }

}
