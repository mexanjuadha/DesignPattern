package com.icehousecorp.gof.commandpattern.v2.invoker;


import com.icehousecorp.gof.commandpattern.v2.command.TrackerCommand;

/**
 * Created by mexanjuadha on 2/18/16.
 */

// INVOKER
public class TrackerButton {

    TrackerCommand command;

    public TrackerButton(TrackerCommand command) {
        this.command = command;
    }

    public void btnPressed() {
        command.execute();
    }


}
