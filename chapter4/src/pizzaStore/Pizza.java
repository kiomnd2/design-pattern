package pizzaStore;

import java.util.ArrayList;

public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList<String> toppings = new ArrayList<>();


    protected void setName(String name) {
        this.name = name;
    }

    protected void setDough(String dough) {
        this.dough = dough;
    }

    protected void setSauce(String sauce) {
        this.sauce = sauce;
    }

    protected void addTopping(String topping)
    {
        toppings.add(topping);
    }

    public void prepare()
    {
        System.out.println("Prepareing Name : " +name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings ...");
        for(int i =0; i < toppings.size() ; i++)
        {
            System.out.println(" " + toppings.get(i));
        }

    }

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

    public String getName() {
        return name;
    }


}
