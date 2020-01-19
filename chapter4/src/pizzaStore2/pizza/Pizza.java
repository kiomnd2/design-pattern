package pizzaStore2.pizza;

import pizzaStore2.cheese.Cheese;
import pizzaStore2.dough.Dough;
import pizzaStore2.peperoni.Peperoni;
import pizzaStore2.sauce.Sauce;

public abstract class Pizza {

    private String name;
    private Dough dough;
    private Cheese cheese;
    private Sauce sauce;
    private Peperoni peperoni;

    public abstract void prepare();

    public void bake()
    {
        System.out.println("bake for 25 minuates at 350");
    }

    public void cut()
    {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box()
    {
        System.out.println("Place pizzaStore.Pizza in official pizzaStore.PizzaStore box");
    }

    public void makePizza() {
        this.prepare();
        this.bake();
        this.cut();
        this.box();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setPeperoni(Peperoni peperoni) {
        this.peperoni = peperoni;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return getName();
    }


}
