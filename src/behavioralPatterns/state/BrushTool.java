package behavioralPatterns.state;

public class BrushTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("show the brush cursor");
    }

    @Override
    public void mouseDown() {
        System.out.println("draw using brush");
    }
}
