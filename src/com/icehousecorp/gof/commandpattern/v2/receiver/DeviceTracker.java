package  com.icehousecorp.gof.commandpattern.v2.receiver;

/**
 * Created by mexanjuadha on 2/18/16.
 */
public class DeviceTracker {

    public static TrackerDevice getGpsTrackerDevice() {
        return new GPSTracker();
    }

    public static TrackerDevice getSateliteTrackerDevice() {
        return new SateliteTracker();
    }


}
