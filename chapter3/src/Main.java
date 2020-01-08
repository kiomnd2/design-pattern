public class Main {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());


    }
}
