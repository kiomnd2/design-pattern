public class Beverage
{
    private String description;

    private boolean milk;
    private boolean soy;
    private boolean mocha;

    public boolean isMilk() {
        return milk;
    }
    public void setMilk(boolean milk) {
        this.milk = milk;
    }
    public boolean isSoy() {
        return soy;
    }
    public void setSoy(boolean soy) {
        this.soy = soy;
    }
    public boolean isMocha() {
        return mocha;
    }
    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public double cost(){
        double cost =0.0;
        if(isMilk())
        {
            cost += 1.0;
        }
        if(isMocha())
        {
            cost += 1.0;
        }
        if(isSoy())
        {
            cost += 1.0;
        }
        return cost;
    }

}
