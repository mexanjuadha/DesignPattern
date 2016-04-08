package com.icehousecorp.gof.compoundpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mexanjuadha on 3/31/16.
 */
public class Kantor implements TukangPotong {

    ArrayList<TukangPotong> tukangPotongs = new ArrayList<>();

    public void add(TukangPotong tukangPotong){
        tukangPotongs.add(tukangPotong);
    }

    @Override
    public void cukur() {
        Iterator tukangIterator = tukangPotongs.iterator();

        while (tukangIterator.hasNext()){

            TukangPotong tukangPotong = (TukangPotong) tukangIterator.next();
            tukangPotong.cukur();

        }

    }
}
