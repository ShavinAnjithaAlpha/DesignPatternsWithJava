package behavioralPatterns.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("show the selection cursor");
    }

    @Override
    public void mouseDown() {
        System.out.println("show selected area");
    }
}
