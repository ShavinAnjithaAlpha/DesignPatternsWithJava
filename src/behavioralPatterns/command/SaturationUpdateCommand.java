package behavioralPatterns.command;

import behavioralPatterns.command.UI.Command;

public class SaturationUpdateCommand implements Command {

    private final int saturationLevel;

    public SaturationUpdateCommand(int saturationLevel) {
        this.saturationLevel = saturationLevel;
    }


    @Override
    public void execute() {
        System.out.println("apply saturation to level " + saturationLevel);
    }
}
