package Bridge;

import java.security.SecureRandom;

public abstract class Window {

    private WindowImp windowImp;

    public Window() {
        int n = new SecureRandom().nextInt(-5, 5);
        if (n < 0) {
            windowImp = new AWindowImp();
        } else {
            windowImp = new BWindowImp();
        }
    }

    public void drawRect() {
        windowImp.drawLine();
        windowImp.drawLine();
        windowImp.drawLine();
        windowImp.drawLine();
        // process logic
    }

    void drawText() {
        windowImp.drawText();
    }

    @Override
    public String toString() {
        return windowImp.toString();
    }
}
