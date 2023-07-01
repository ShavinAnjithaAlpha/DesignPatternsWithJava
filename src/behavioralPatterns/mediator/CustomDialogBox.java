package behavioralPatterns.mediator;

public class CustomDialogBox extends DialogBox {
    private ListView listView = new ListView(this);
    private Button button = new Button(this, "");
    private TextField textField = new TextField(this);

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
        if (content == null || content.isEmpty()) {
            button.setEnabled(false);
        } else {
            button.setEnabled(true);
        }
   }
}
