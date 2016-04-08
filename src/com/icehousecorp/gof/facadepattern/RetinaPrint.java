package com.icehousecorp.gof.facadepattern;

/**
 * Created by mexanjuadha on 2/25/16.
 */
public class RetinaPrint {

    private static final int oldRetinaPrintId = 100;

    private int retinaPrintId;

    public boolean isRetinaPrintValid(int fingerPrintId) {
        return oldRetinaPrintId == fingerPrintId;
    }

    public static int getOldRetinaPrintId() {
        return oldRetinaPrintId;
    }

    public int getRetinaPrintId() {
        return retinaPrintId;
    }

    public void setRetinaPrintId(int retinaPrintId) {
        this.retinaPrintId = retinaPrintId;
    }
}
