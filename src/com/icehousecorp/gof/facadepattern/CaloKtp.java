package com.icehousecorp.gof.facadepattern;

/**
 * Created by mexanjuadha on 2/25/16.
 */
public class CaloKtp {

    public void updateKtp(String idKtp, String nama, String tglLahir, int fingerPrintUser, int retinaPrintUser){
        KelurahanCoblong kelurahanCoblong = new KelurahanCoblong();
        Formulir formulir = kelurahanCoblong.getFormulir();
        FingerPrint fingerPrint = kelurahanCoblong.getFingerPrint();
        RetinaPrint retinaPrint = kelurahanCoblong.getRetinaPrint();


        formulir.setKtpId(idKtp);
        formulir.setNama(nama);
        formulir.setTglLahir(tglLahir);
        if (fingerPrint.isFingerPrintValid(fingerPrintUser)) {
            fingerPrint.setFingerPrintId(fingerPrintUser);
        }
        if (retinaPrint.isRetinaPrintValid(retinaPrintUser)) {
            retinaPrint.setRetinaPrintId(retinaPrintUser);
        }

        kelurahanCoblong.cetakKtp();
    }
}
