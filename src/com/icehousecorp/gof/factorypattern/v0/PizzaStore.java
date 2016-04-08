package com.icehousecorp.gof.factorypattern.v0;

/**
 * Created by mexanjuadha on 2/4/16.
 */
public class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("sosis")) {
            pizza = new SosisPizza();
        } else {
            pizza = null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
