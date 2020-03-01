package pizzaStore;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza= null ;
        //임시적으로 치즈피자만 만들 수 있다고 가정한다.
        //type == cheese
        pizza = new ChicagoStyleCheesePizza();

        return pizza;
    }
}
