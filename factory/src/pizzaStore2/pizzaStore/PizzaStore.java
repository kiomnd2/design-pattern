package pizzaStore2.pizzaStore;

import pizzaStore2.pizza.Pizza;

public abstract
class PizzaStore {

    public Pizza orderPizza(String type)
    {
        Pizza pizza = createPizza(type);
        pizza.makePizza();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
