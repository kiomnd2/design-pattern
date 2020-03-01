package pizzaStore2;

import pizzaStore2.pizza.Pizza;
import pizzaStore2.pizzaStore.NYPizzaStore;
import pizzaStore2.pizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");


    }
}
