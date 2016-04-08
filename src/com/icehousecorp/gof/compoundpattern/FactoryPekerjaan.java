package com.icehousecorp.gof.compoundpattern;

/**
 * Created by mexanjuadha on 3/31/16.
 */
public class FactoryPekerjaan extends AbstractFactoryPekerjaan {
    @Override
    TukangPotong createTukangCukur() {
        return new TukangCukur();
    }

    @Override
    TukangPotong createTukangKebun() {
        return new TukangKebun();
    }

    @Override
    TukangPotong createSupir() {
        return new AdapterSupir(new Supir());
    }
}
