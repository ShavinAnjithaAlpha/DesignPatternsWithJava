package creationalPatterns.AbstractFactory;

public class Demo {

    public static void main(String[] args) {
        // create Metal UI factory
        UIFactory metalUIFactory = new MetalUIFactory();
        Window metalWindow = metalUIFactory.createWindow();
        Button metalButton = metalUIFactory.createButton();

        metalWindow.drawContent();
        metalButton.drawImage();

        UIFactory classicUIFactory = new ClassicUIFactory();
        Window classicWindow = classicUIFactory.createWindow();
        Button classicButton = classicUIFactory.createButton();

        classicWindow.drawContent();
        classicButton.drawImage();

    }
}
