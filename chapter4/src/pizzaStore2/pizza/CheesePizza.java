package pizzaStore2.pizza;

import pizzaStore2.PizzaIngredientFactory;
import pizzaStore2.dough.ThinCrustDough;

public class CheesePizza extends Pizza{
    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setCheese(pizzaIngredientFactory.createcheese());
        setSauce(pizzaIngredientFactory.createSouce());
    }
}
