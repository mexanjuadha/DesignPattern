package com.icehousecorp.gof.proxypatern.virtual;

/**
 * Created by mexanjuadha on 3/24/16.
 */
public class RealImage implements ImageContract {


    private static final String TAG = RealImage.class.getSimpleName();

    public RealImage() {
    }

    @Override
    public void createImage() {
        try {
            Thread.sleep(3000);
            System.out.println("createImage: ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
