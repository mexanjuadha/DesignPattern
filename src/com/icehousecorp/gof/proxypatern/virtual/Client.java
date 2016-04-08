package com.icehousecorp.gof.proxypatern.virtual;

/**
 * Created by mexanjuadha on 3/24/16.
 */
public class Client {

    public static void getImage() {
        ImageProxy imageProxy = new ImageProxy();
        imageProxy.createImage();
    }

}
