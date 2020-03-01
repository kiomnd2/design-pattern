public class SoldOutState implements State {
    GamballMachine gamballMachine;

    public SoldOutState(GamballMachine gamballMachine) {
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
