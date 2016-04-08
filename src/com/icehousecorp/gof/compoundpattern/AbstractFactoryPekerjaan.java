package com.icehousecorp.gof.compoundpattern;

/**
 * Created by mexanjuadha on 3/31/16.
 */
public abstract class AbstractFactoryPekerjaan {

    abstract TukangPotong createTukangCukur();

    abstract TukangPotong createTukangKebun();

    abstract TukangPotong createSupir();

}
