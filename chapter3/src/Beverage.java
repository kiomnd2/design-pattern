public abstract class Beverage {
    private String description;

    public String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    protected String setDecorator(Beverage beverage)
    {
        return (getDescription() +" , "+ beverage.getDescription());
    }


    public abstract double cost();
}
