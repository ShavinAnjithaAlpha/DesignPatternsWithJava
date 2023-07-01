package behavioralPatterns.mediator;

public class Demo {

    public static void main(String[] args) {
        // create a custom dialog box
        CustomDialogBox dialogBox = new CustomDialogBox();
        dialogBox.getListView().setSelectedText("abc");
        System.out.println(dialogBox.getButton().isEnabled());
        System.out.println(dialogBox.getTextField().getContentText());
        System.out.println();

        dialogBox.getTextField().setContentText("");
        System.out.println(dialogBox.getButton().isEnabled());
        System.out.println(dialogBox.getTextField().getContentText());
        System.out.println();

        dialogBox.getTextField().setContentText("bcd");
        System.out.println(dialogBox.getButton().isEnabled());
        System.out.println(dialogBox.getTextField().getContentText());


    }
}
