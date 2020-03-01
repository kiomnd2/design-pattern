package pizzaStore2;

import pizzaStore2.cheese.Cheese;
import pizzaStore2.dough.Dough;
import pizzaStore2.peperoni.Peperoni;
import pizzaStore2.sauce.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSouce();
    public Cheese createcheese();
    public Peperoni createPepperoni();
}
