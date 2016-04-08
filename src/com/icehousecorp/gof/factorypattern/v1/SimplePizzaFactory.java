package com.icehousecorp.gof.factorypattern.v1;


/**
 * Created by mexanjuadha on 2/4/16.
 */
public class SimplePizzaFactory {

    Pizza pizza;

    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return pizza;
        } else {
            return null;
        }
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }


}
