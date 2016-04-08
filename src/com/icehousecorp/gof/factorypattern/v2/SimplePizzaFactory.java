package com.icehousecorp.gof.factorypattern.v2;


/**
 * Created by mexanjuadha on 2/4/16.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza;

        if (type.equals("cheese")) {
            return new CheesePizza();
        } else {
            return null;
        }
    }


}
