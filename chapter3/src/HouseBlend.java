public class HouseBlend extends Beverage
{

    @Override
    public void setDescription(String description) {
        super.setDescription("하우스 블랜드 커피");
    }

    @Override
    public double cost() {
        return super.cost() +1.9;
    }
}
