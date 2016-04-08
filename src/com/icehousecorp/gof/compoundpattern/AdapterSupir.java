package com.icehousecorp.gof.compoundpattern;

/**
 * Created by mexanjuadha on 3/31/16.
 */
public class AdapterSupir implements TukangPotong {

    Supir supir;

    public AdapterSupir(Supir supir) {
        this.supir = supir;
    }

    @Override
    public void cukur() {
        supir.setir();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
