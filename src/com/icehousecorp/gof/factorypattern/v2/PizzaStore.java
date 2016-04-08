package com.icehousecorp.gof.factorypattern.v2;

/**
 * Created by mexanjuadha on 2/4/16.
 */
public abstract class PizzaStore {


    public Pizza orderPizza(Pizza type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(Pizza type);

}
