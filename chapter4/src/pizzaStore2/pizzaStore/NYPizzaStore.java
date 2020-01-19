package pizzaStore2.pizzaStore;


import pizzaStore2.NYPizzaIngredientFactory;
import pizzaStore2.PizzaIngredientFactory;
import pizzaStore2.pizza.CheesePizza;
import pizzaStore2.pizza.PeperoniPizza;
import pizzaStore2.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese"))
        {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York cheese Pizza");
        }
        else
        {
            pizza = new PeperoniPizza(ingredientFactory);
            pizza.setName("New York peperoni Pizza");
        }

        return pizza;
    }
}
