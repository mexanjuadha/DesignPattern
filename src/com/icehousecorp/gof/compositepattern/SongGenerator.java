package com.icehousecorp.gof.compositepattern;

/**
 * Created by mexanjuadha on 3/17/16.
 */
public class SongGenerator {

    public static void showCompositePattern(){

        SongComponent keroncongMusic =
            new SongGroup("Keroncong","");

        SongComponent popMusic =
            new SongGroup("Pop Kuno","");

        SongComponent keroncongMelayu =
            new SongGroup("Keroncong Melayu","");

        SongComponent listSong = new SongGroup("Song List", "");

        listSong.add(keroncongMusic);

        keroncongMusic.add(new Song("Solo Balapan", "A", 1878));
        keroncongMusic.add(new Song("Bandung Balapan", "A", 1878));

        keroncongMusic.add(keroncongMelayu);

        keroncongMelayu.add(new Song("Malaysia Keroncong", "", 1987));
        keroncongMelayu.add(new Song("Aceh Keroncong", "", 1876));


        listSong.add(popMusic);

        popMusic.add(new Song("Pop Music A", "", 2010));
        popMusic.add(new Song("Pop Music B", "Motorhead", 1950));

        DiskJockey mbahJockey = new DiskJockey(listSong);

        mbahJockey.getSongList();
    }

}
