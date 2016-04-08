package com.icehousecorp.gof.commandpattern.v2.command;


import com.icehousecorp.gof.commandpattern.v2.receiver.TrackerDevice;

/**
 * Created by mexanjuadha on 2/18/16.
 */
public class StartTrackerDevice implements TrackerCommand {

    TrackerDevice trackerDevice;

    public StartTrackerDevice(TrackerDevice trackerDevice) {
        this.trackerDevice = trackerDevice;
    }

    @Override
    public void execute() {
        trackerDevice.startTrack();
    }
}
