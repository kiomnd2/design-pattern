package pizzaStore2;

import pizzaStore2.cheese.Cheese;
import pizzaStore2.cheese.ReggianoChesse;
import pizzaStore2.dough.Dough;
import pizzaStore2.dough.ThinCrustDough;
import pizzaStore2.peperoni.Peperoni;
import pizzaStore2.peperoni.SlicedPepperoni;
import pizzaStore2.sauce.MarinaraSauce;
import pizzaStore2.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough()
    {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSouce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createcheese() {
        return new ReggianoChesse();
    }

    @Override
    public Peperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
