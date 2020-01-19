public class SimplePizzaFactory {

    public Pizza createPizza(String type)
    {
        Pizza pizza =null;

        if(type.equals("cheese"))
        {
            pizza = new CheesePizza();
        }
        else
        {
            pizza = new GreekPizza();
        }

        return pizza;
    }
}
