package com.icehousecorp.gof.compoundpattern;

/**
 * Created by mexanjuadha on 3/31/16.
 */
public class PerformanceReview implements TukangPotong {

    TukangPotong pekerjaan;

    static int performanceCount;

    Observable observable;

    public PerformanceReview(TukangPotong pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    @Override
    public void cukur() {
        pekerjaan.cukur();
        performanceCount++;
    }

    public static int getPerformanceCount() {
        return performanceCount;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
