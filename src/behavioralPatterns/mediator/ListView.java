package behavioralPatterns.mediator;

public class ListView extends Widget {

    private String selectedText;

    public ListView(DialogBox parent) {
        super(parent);
    }

    public String getSelectedText() {
        return selectedText;
    }

    public void setSelectedText(String selectedText) {
        this.selectedText = selectedText;
        dialogBox.changed(this);
    }
}
