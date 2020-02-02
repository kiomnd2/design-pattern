import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoteControlWithUndo {
    List<Command> onCommand = new ArrayList<>();
    Command undoCommand;

    public RemoteControlWithUndo() {
        Command noCommand = new noCommand();
        undoCommand = noCommand;
    }
    public void setCommand(int slot, Command onCommand) {
        this.onCommand.add(slot,onCommand);
    }

    public void onButtonWasPushed(int slot) {
        this.onCommand.get(slot).execute();
        undoCommand = this.onCommand.get(slot);
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

}
