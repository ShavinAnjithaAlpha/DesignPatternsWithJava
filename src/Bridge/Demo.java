package Bridge;

public class Demo {

    public static void main(String[] args) {
        // create a Window class
        Window iconWindow = new IconWindow();
        Window transientWindow = new TransientWindow();

        System.out.println(iconWindow);
        System.out.println(transientWindow);
    }
}
