package com.icehousecorp.gof.iteratorpattern;

/**
 * Created by mexanjuadha on 3/10/16.
 */
public class TradisionalKtp implements KtpIterator {

    Ktp[] ktps;

    int arrayValue = 0;

    public TradisionalKtp() {
        ktps = new Ktp[3];
        addKtp("Mexan Juadha", "Tasikmalaya","A");
        addKtp("Mexan Juadha", "Tasikmalaya","A");
        addKtp("Mexan Juadha", "Tasikmalaya","A");

    }

    public void addKtp(String nama, String alamat, String golDarah) {
        Ktp ktp = new Ktp(nama, alamat, golDarah);
        ktps[arrayValue] = ktp;
        arrayValue++;
    }

    public Ktp[] getKtps() {
        return ktps;
    }


    @Override
    public boolean hasnext() {
        return false;
    }

    @Override
    public Ktp next() {
        return null;
    }
}
