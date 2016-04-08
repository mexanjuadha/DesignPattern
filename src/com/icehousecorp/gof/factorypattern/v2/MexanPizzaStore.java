package com.icehousecorp.gof.factorypattern.v2;

/**
 * Created by mexanjuadha on 2/4/16.
 */
public class MexanPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(Pizza type) {
        if (type.equals("cheese")) {
            return new CheeseMexanPizza();
        } else {
            return null;
        }
    }
}
