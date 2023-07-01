package behavioralPatterns.command.UI;

public class Button {

    private String label;
    private Command command;

    public Button(String label, Command command) {
        this.label = label;
        this.command = command;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void clicked() {
        command.execute();
    }
}
