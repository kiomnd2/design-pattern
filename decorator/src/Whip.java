public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        setDescription("휘핑크림");
        setDescription(beverage.setDecorator(this));
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
