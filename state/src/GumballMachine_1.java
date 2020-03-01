public class GumballMachine_1 {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER= 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3 ;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine_1(int count) {
        this.count = count;
        if (count > 0 ) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if(state == HAS_QUARTER) {
            //...
        }
        else if( state ==NO_QUARTER) {
            ///...
        }
        else if( state == SOLD_OUT) {
            //..
        }
        else {
            //..
        }
    }

    public void ejectQuarter () {
        if(state == HAS_QUARTER) {
            //...
        }
        else if( state ==NO_QUARTER) {
            ///...
        }
        else if( state == SOLD_OUT) {
            //..
        }
        else {
            //..
        }
    }

    public void turnCrank() {
        if(state == HAS_QUARTER) {
            //...
        }
        else if( state ==NO_QUARTER) {
            ///...
        }
        else if( state == SOLD_OUT) {
            //..
        }
        else {
            //..
        }
    }

    public void dispense() {
        if(state == HAS_QUARTER) {
            //...
        }
        else if( state ==NO_QUARTER) {
            ///...
        }
        else if( state == SOLD_OUT) {
            //..
        }
        else {
            //..
        }
    }
}
