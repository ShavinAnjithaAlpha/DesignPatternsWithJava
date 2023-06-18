package AbstractFactory;

public class MetalWindow implements Window {


    @Override
    public void drawBorder() {
        System.out.println("draw metal window");
    }

    @Override
    public void drawContent() {
        System.out.println("draw metal window border");
    }
}
