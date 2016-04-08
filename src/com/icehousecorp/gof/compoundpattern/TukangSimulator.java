package com.icehousecorp.gof.compoundpattern;

/**
 * Created by mexanjuadha on 3/31/16.
 */
public class TukangSimulator {


    public static void tukang() {

        AbstractFactoryPekerjaan abstractFactoryPekerjaan = new FactoryDecoratorPekerjaan();
        TukangPotong tukangCukur = abstractFactoryPekerjaan.createTukangCukur();
        TukangPotong tukangKebun = abstractFactoryPekerjaan.createTukangKebun();
        TukangPotong supirAdapter = abstractFactoryPekerjaan.createTukangKebun();


        simulate(tukangCukur);
        simulate(tukangKebun);
        simulate(supirAdapter);

        AbstractFactoryPekerjaan factoryPekerjaan = new FactoryPekerjaan();
        TukangPotong tukangCukurAja = factoryPekerjaan.createTukangCukur();
        TukangPotong tukangKebunAja = factoryPekerjaan.createTukangKebun();

        Kantor kantor = new Kantor();
        kantor.add(tukangCukurAja);
        kantor.add(tukangKebunAja);

        PerformancePeople performancePeople = new PerformancePeople();
        kantor.registerObserver(performancePeople);

        simulate(kantor)

        PerformanceReview.getPerformanceCount();
    }

    public static void simulate(TukangPotong tukangPotong) {
        tukangPotong.cukur();
    }

}
