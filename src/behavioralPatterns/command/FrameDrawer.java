package behavioralPatterns.command;

public class FrameDrawer {

    private final int code;

    public FrameDrawer(int code) {
        this.code = code;
    }

    public void drawFrame() {
        System.out.println("frame draw : type " + code);
    }
}
