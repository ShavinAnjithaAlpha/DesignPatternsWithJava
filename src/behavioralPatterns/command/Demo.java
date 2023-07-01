package behavioralPatterns.command;

import behavioralPatterns.command.UI.Button;
import behavioralPatterns.command.UI.CheckBox;
import behavioralPatterns.command.UI.Command;

public class Demo {

    public static void main(String[] args) {
        // create couple of commands
        Command frameDrawer = new AddFrameCommand(45);
        Button button = new Button("button", frameDrawer);
        button.clicked();

        // create a composite command
        System.out.println();
        Command compositeCommand = new CompositeCommand().add(frameDrawer)
                .add(new ResizeCommand()).add(new SaturationUpdateCommand(12));
        CheckBox checkBox = new CheckBox(compositeCommand);
        checkBox.toggle();
        checkBox.toggle();
        checkBox.toggle();
    }
}
