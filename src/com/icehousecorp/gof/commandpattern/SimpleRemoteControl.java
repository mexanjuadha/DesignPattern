package com.icehousecorp.gof.commandpattern;

/**
 * Created by mexanjuadha on 2/18/16.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
