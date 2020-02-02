import java.util.Arrays;

public class RemoteControlWithUndo {
    Command[] onCommand;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommand = new Command[7]; // 버튼 7개까지만 등록

        Command noCommand = new noCommand();

        Arrays.stream(onCommand).forEach(command -> {
            command = noCommand;
        } );
        undoCommand = noCommand;
    }
    public void setCommand(int slot, Command onCommand) {
        this.onCommand[slot] = onCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommand[slot].execute();
        undoCommand = this.onCommand[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

}
