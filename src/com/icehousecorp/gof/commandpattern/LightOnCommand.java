package com.icehousecorp.gof.commandpattern;

/**
 * Created by mexanjuadha on 2/18/16.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.onLight();
    }
}
