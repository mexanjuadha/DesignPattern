package  com.icehousecorp.gof.commandpattern.v2.command;


import com.icehousecorp.gof.commandpattern.v2.receiver.TrackerDevice;

/**
 * Created by mexanjuadha on 2/18/16.
 */
public class EndTrackerDevice implements TrackerCommand {

    TrackerDevice trackerDevice;

    public EndTrackerDevice(TrackerDevice trackerDevice) {
        this.trackerDevice = trackerDevice;
    }

    @Override
    public void execute() {
        trackerDevice.endTrack();
    }
}
