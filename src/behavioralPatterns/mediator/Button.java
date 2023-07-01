package behavioralPatterns.mediator;

public class Button extends Widget {

    private String label;
    private boolean isEnabled = false;

    public Button(DialogBox parent, String label) {
        super(parent);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        dialogBox.changed(this);
    }
}
