import java.util.Stack;

public class SoldState implements State {
    GamballMachine gamballMachine;

    public SoldState(GamballMachine gamballMachine) {
        this.gamballMachine = gamballMachine;
    }

    @Override
    public void insertQuarter() {
        //...
    }

    @Override
    public void ejectQuarter() {
        //...
    }

    @Override
    public void tumCrank() {
        //...
    }

    @Override
    public void dispense() {
        //...
    }
}
