import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command{
    List<Command> commands = new ArrayList<>();

    public MacroCommand()
    {
    }

    public void addCommand( Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {

    }
}
