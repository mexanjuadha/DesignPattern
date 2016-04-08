package com.icehousecorp.gof.iteratorpattern;

/**
 * Created by mexanjuadha on 3/10/16.
 */
public class Ktp {

    private String nama;

    private String alamat;

    private String golDarah;

    public Ktp(String nama, String alamat, String golDarah) {
        this.nama = nama;
        this.alamat = alamat;
        this.golDarah = golDarah;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getGolDarah() {
        return golDarah;
    }
}
