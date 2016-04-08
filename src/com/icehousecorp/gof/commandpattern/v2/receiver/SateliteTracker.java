package  com.icehousecorp.gof.commandpattern.v2.receiver;


/**
 * Created by mexanjuadha on 2/18/16.
 */
public class SateliteTracker implements TrackerDevice {

    private static final String TAG = SateliteTracker.class.getSimpleName();

    @Override
    public void startTrack() {
        System.out.println("startTrack() called with satelite: " + "");
    }

    @Override
    public void endTrack() {
        System.out.println("endTrack() called with satelite: " + "");

    }
}
