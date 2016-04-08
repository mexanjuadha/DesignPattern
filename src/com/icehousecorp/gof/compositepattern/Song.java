package com.icehousecorp.gof.compositepattern;

/**
 * Created by mexanjuadha on 3/17/16.
 */
public class Song extends SongComponent {

    private static final String TAG = Song.class.getSimpleName();

    String songName;

    String bandName;

    int releaseYear;

    public Song(String newSongName, String newBandName, int newReleaseYear) {
        songName = newSongName;
        bandName = newBandName;
        releaseYear = newReleaseYear;
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void displaySongInfo() {
        System.out.println("displaySongInfo() called with: " + getSongName() + getBandName() + getReleaseYear());
    }
}
