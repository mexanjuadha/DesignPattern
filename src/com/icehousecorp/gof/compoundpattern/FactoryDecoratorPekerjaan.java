package com.icehousecorp.gof.compoundpattern;

/**
 * Created by mexanjuadha on 3/31/16.
 */
public class FactoryDecoratorPekerjaan extends AbstractFactoryPekerjaan {
    @Override
    TukangPotong createTukangCukur() {
        return new PerformanceReview(new TukangCukur());
    }

    @Override
    TukangPotong createTukangKebun() {
        return new PerformanceReview(new TukangKebun());
    }

    @Override
    TukangPotong createSupir() {
        return new PerformanceReview(new AdapterSupir(new Supir()));
    }
}
