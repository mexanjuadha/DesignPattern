package com.icehousecorp.gof.decoratorpattern;

/**
 * Created by mexanjuadha on 1/28/16.
 */
public abstract class MenuUtama {

    protected String description = "Menu Utama :";

    public String getDescription() {
        return description;
    }

    public abstract void getOrder();

    protected abstract double getCost();
}
