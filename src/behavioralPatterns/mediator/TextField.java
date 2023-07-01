package behavioralPatterns.mediator;

import java.awt.*;

public class TextField extends Widget {

    private String contentText;

    public TextField(DialogBox parent) {
        super(parent);
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
        dialogBox.changed(this);
    }
}
