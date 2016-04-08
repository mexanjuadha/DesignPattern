package com.icehousecorp.gof.factorypattern.v1;

/**
 * Created by mexanjuadha on 2/4/16.
 */
public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = simplePizzaFactory.createPizza("Cheasee");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        simplePizzaFactory.setPizza(new FishPizza());
        return pizza;
    }

}
