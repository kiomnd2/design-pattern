package pizzaStore2.pizza;

import pizzaStore2.PizzaIngredientFactory;

public class PeperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PeperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("prepareing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setCheese(pizzaIngredientFactory.createcheese());
        setPeperoni(pizzaIngredientFactory.createPepperoni());

    }
}
