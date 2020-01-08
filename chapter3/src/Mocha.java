public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        setDescription("모카");
        setDescription(beverage.setDecorator(this));
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
