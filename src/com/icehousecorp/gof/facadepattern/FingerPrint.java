package com.icehousecorp.gof.facadepattern;

/**
 * Created by mexanjuadha on 2/25/16.
 */
public class FingerPrint {

    private static final int oldFingerPrintId = 100;

    private int fingerPrintId;

    public boolean isFingerPrintValid(int fingerPrintId) {
        return oldFingerPrintId == fingerPrintId;
    }

    public static int getOldFingerPrintId() {
        return oldFingerPrintId;
    }

    public int getFingerPrintId() {
        return fingerPrintId;
    }

    public void setFingerPrintId(int fingerPrintId) {
        this.fingerPrintId = fingerPrintId;
    }
}
