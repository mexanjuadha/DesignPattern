package com.icehousecorp.gof.compoundpattern;

/**
 * Created by mexanjuadha on 3/31/16.
 */
public class PerformancePeople implements Observer {

    @Override
    public void update(TukangObervable tukangObervable) {
        System.out.println("Pengawas" + tukangObervable + "Kerja");
    }
}
