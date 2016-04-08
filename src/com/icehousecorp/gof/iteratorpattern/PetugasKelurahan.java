package com.icehousecorp.gof.iteratorpattern;

import java.util.ArrayList;

/**
 * Created by mexanjuadha on 3/10/16.
 */
public class PetugasKelurahan {

    private static final String TAG = PetugasKelurahan.class.getSimpleName();

    private KtpIterator tradisionalKtpIterator;

    private KtpIterator electronicKtpIterator;

    private ElectronicKtp electronicKtp;

    private TradisionalKtp tradisionalKtp;

    public PetugasKelurahan(
        KtpIterator tradisionalKtpIterator,
        KtpIterator electronicKtpIterator) {
        this.tradisionalKtpIterator = tradisionalKtpIterator;
        this.electronicKtpIterator = electronicKtpIterator;
    }

    // This is BAD !!
    public void showKtps() {
        ArrayList<Ktp> ktpArrayList = electronicKtp.getKtps();

        for (Ktp ktp : ktpArrayList) {
            System.out.println("showKtps() called with: " + ktp.getNama() + "");
            System.out.println("showKtps() called with: " + ktp.getAlamat() + "");
            System.out.println("showKtps() called with: " + ktp.getGolDarah() + "");
        }
        Ktp[] ktpsArray = tradisionalKtp.getKtps();

        for (Ktp ktp : ktpsArray) {
            System.out.println("showKtps() called with: " + ktp.getNama() + "");
            System.out.println("showKtps() called with: " + ktp.getAlamat() + "");
            System.out.println("showKtps() called with: " + ktp.getGolDarah() + "");
        }
    }

    public void showKtpBetterWay() {
        KtpIterator tradisionalKtp = new  ElectronicKtp();
        printKtp(tradisionalKtp
        );
    }

    private void printKtp(KtpIterator iterator) {
        System.out.println("Iterator 1");
        while (iterator.hasnext()) {
            Ktp ktp = iterator.next();
            System.out.println("showKtps() called with: " + ktp.getNama() + "");
            System.out.println("showKtps() called with: " + ktp.getAlamat() + "");
            System.out.println("showKtps() called with: " + ktp.getGolDarah() + "");
        }

        System.out.println("Iterator 2");
        while (iterator.hasnext()) {
            Ktp ktp = iterator.next();
            System.out.println("showKtps() called with: " + ktp.getNama() + "");
            System.out.println("showKtps() called with: " + ktp.getAlamat() + "");
            System.out.println("showKtps() called with: " + ktp.getGolDarah() + "");
        }
    }
}
