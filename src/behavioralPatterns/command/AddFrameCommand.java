package behavioralPatterns.command;

import behavioralPatterns.command.UI.Command;

public class AddFrameCommand implements Command {

    private final FrameDrawer drawer;

    public AddFrameCommand(int frameCode) {
        this.drawer = new FrameDrawer(frameCode);
    }

    @Override
    public void execute() {
        drawer.drawFrame();
    }
}
