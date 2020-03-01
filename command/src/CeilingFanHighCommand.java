public class CeilingFanHighCommand implements Command {
    CellingFan cellingFan;
    int prevSpeed;


    public CeilingFanHighCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed == CellingFan.HIGH)
        {
            cellingFan.high();
        }
        else if(prevSpeed == CellingFan.MEDIUM)
        {
            cellingFan.medium();
        }
        else if( prevSpeed == CellingFan.LOW)
        {
            cellingFan.low();
        }
        else
        {
            cellingFan.off();
        }
    }
}
