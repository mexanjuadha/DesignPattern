package com.icehousecorp.gof.iteratorpattern;

import java.util.ArrayList;

/**
 * Created by mexanjuadha on 3/10/16.
 */
public class ElectronicKtp implements KtpIterator {

    ArrayList<Ktp> ktps;

    int position = 0;

    public ElectronicKtp() {
        ktps = new ArrayList<>();
        addKtp("Mexan Juadha", "Tasikmalaya", "A");
        addKtp("Mexan Juadha", "Tasikmalaya", "A");
        addKtp("Mexan Juadha", "Tasikmalaya", "A");

    }

    public void addKtp(String nama, String alamat, String golDarah) {
        Ktp ktp = new Ktp(nama, alamat, golDarah);
        ktps.add(ktp);
    }

    public ArrayList<Ktp> getKtps() {
        return ktps;
    }

    @Override
    public boolean hasnext() {
        if (position >= ktps.size() || ktps.get(position) == null) {
            position = 0;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Ktp next() {

        Ktp ktp = ktps.get(position);

        position++;

        return ktp;

    }

    public void clearPosition(){

    }
}
