package AbstractFactory;

public class MetalUIFactory implements UIFactory {


    @Override
    public Window createWindow() {
        return new MetalWindow();
    }

    @Override
    public Button createButton() {
        return new MetalButton();
    }
}
