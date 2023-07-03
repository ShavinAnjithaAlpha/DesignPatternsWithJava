package behavioralPatterns.mediator;

public class CustomDialogBox extends DialogBox {
    private final ListView listView = new ListView(this);
    private final Button button = new Button(this, "");
    private final TextField textField = new TextField(this);

    public ListView getListView() {
        return listView;
    }

    public Button getButton() {
        return button;
    }

    public TextField getTextField() {
        return textField;
    }

    @Override
    public void changed(Widget widget) {
        if (widget == listView) {
            listBoxSelected();
        } else if (widget == textField) {
            contentChanged();
        }
    }

    public void listBoxSelected() {
        textField.setContentText(listView.getSelectedText());
        button.setEnabled(true);
    }

    private void contentChanged() {
        String content = textField.getContentText();
        button.setEnabled(content != null && !content.isEmpty());
    }
}
