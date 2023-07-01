package behavioralPatterns.command.UI;

public class CheckBox {

    private String label;
    private boolean currentState;
    private Command command;


    public CheckBox(Command command) {
        this.label = label;
        this.command = command;
        currentState = false;
    }

    public void toggle() {
        if (!currentState) {
            command.execute();
        }
        currentState = !currentState;
    }
}
