package com.icehousecorp.gof.compositepattern;

/**
 * Created by mexanjuadha on 3/17/16.
 */
public class DiskJockey  {
    SongComponent songList;

    public DiskJockey(SongComponent newSongList){
        songList = newSongList;
    }

    public void getSongList(){
        songList.displaySongInfo();
    }
}
