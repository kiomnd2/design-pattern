public class DartRoast extends Beverage{


    @Override
    public void setDescription(String description) {
        super.setDescription("다크 로스트 커피");
    }

    @Override
    public double cost() {
        return super.cost()+0.9;
    }
}
