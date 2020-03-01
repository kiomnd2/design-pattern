public class GamballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = this.soldOutState;
    int count;

    public GamballMachine(int numberBumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.count = numberBumballs;

        if (numberBumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.tumCrank();
        state.dispense();
    }

    void setState(State state) {
            this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the solt");
        if (count != 0) {
            count = count - 1 ;
        }
    }

}
