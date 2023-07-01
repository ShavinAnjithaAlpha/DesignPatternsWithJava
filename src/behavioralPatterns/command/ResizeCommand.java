package behavioralPatterns.command;

import behavioralPatterns.command.UI.Command;

public class ResizeCommand implements Command {


    @Override
    public void execute() {
        System.out.println("resize the image");
    }
}
