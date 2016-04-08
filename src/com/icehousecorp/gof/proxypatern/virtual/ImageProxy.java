package com.icehousecorp.gof.proxypatern.virtual;

/**
 * Created by mexanjuadha on 3/24/16.
 */
public class ImageProxy implements ImageContract {

    boolean alreadyCreated = false;

    RealImage realImage;

    @Override
    public void createImage() {
        if (alreadyCreated) {
            realImage.createImage();
        } else {
            System.out.println("createImage: Please Wait");
            realImage = new RealImage();
            realImage.createImage();
            alreadyCreated = true;
        }
    }
}
