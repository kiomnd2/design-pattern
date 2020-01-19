package pizzaStore;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        setName("Chicago Style Deep Dish Cheese pizzaStore.Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauces");

        addTopping("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }


}
