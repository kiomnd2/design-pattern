package pizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        pizza.makePizza();

        System.out.println("===============================");

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        pizza2.makePizza();


    }
}
