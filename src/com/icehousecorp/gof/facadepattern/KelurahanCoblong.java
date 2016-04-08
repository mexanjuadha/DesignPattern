package com.icehousecorp.gof.facadepattern;


/**
 * Created by mexanjuadha on 2/25/16.
 */
public class KelurahanCoblong {

    private static final String TAG =  KelurahanCoblong.class.getSimpleName();

    FingerPrint fingerPrint;

    Formulir formulir;

    RetinaPrint retinaPrint;

    public KelurahanCoblong() {
        fingerPrint = new FingerPrint();
        formulir = new Formulir();
        retinaPrint = new RetinaPrint();
    }

    public void cetakKtp() {
        System.out.println("cetakKtp() called with: " + "");
        System.out.println("KTPID called with: " + formulir.getKtpId());
        System.out.println("NAMA called with: " + formulir.getNama());
        System.out.println("TTL called with: " + formulir.getTglLahir());
        System.out.println("KTPID called with: " + formulir.getKtpId());
    }

    public FingerPrint getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(
        FingerPrint fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    public Formulir getFormulir() {
        return formulir;
    }

    public void setFormulir(Formulir formulir) {
        this.formulir = formulir;
    }

    public RetinaPrint getRetinaPrint() {
        return retinaPrint;
    }

    public void setRetinaPrint(
        RetinaPrint retinaPrint) {
        this.retinaPrint = retinaPrint;
    }
}
