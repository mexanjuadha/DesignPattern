package com.icehousecorp.gof.iteratorpattern;

/**
 * Created by mexanjuadha on 3/10/16.
 */
public class KomputerKelurahan {


    public static void printAllOfKtp(){
        ElectronicKtp electronicKtp = new ElectronicKtp();
        TradisionalKtp tradisionalKtp =  new TradisionalKtp();

        PetugasKelurahan petugasKelurahan = new PetugasKelurahan(tradisionalKtp, electronicKtp);
        petugasKelurahan.showKtpBetterWay();

    }
}
