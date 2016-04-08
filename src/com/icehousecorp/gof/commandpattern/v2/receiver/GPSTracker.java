package  com.icehousecorp.gof.commandpattern.v2.receiver;

/**
 * Created by mexanjuadha on 2/18/16.
 */

// Receiver Class
public class GPSTracker implements TrackerDevice {

    private static final String TAG = GPSTracker.class.getSimpleName() ;

    @Override
    public void startTrack() {
        System.out.println("startTrack() called with GPS: " + "");
    }

    @Override
    public void endTrack() {
        System.out.println("endTrack() called with GPS: " + "");
    }
}
