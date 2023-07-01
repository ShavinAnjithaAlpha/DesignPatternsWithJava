package creationalPatterns.AbstractFactory;

public class ClassicUIFactory implements UIFactory {


    @Override
    public Window createWindow() {
        return new ClassicWindow();
    }

    @Override
    public Button createButton() {
        return new ClassicButton();
    }
}
