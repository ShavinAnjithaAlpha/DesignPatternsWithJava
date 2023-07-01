package creationalPatterns.AbstractFactory;

public class ClassicWindow implements Window {


    @Override
    public void drawBorder() {
        System.out.println("draw classic window content");
    }

    @Override
    public void drawContent() {
        System.out.println("draw classic window border");
    }
}
