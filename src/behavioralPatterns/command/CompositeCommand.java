package behavioralPatterns.command;

import behavioralPatterns.command.UI.Command;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    List<Command> commands = new ArrayList<>();

    public CompositeCommand add(Command command) {
        commands.add(command);
        return this;
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
