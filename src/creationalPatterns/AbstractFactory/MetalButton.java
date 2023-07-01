package creationalPatterns.AbstractFactory;

public class MetalButton implements Button {


    @Override
    public void drawImage() {
        System.out.println("draw metal image");
    }

    @Override
    public void drawBorder() {
        System.out.println("draw metal button border");
    }

    @Override
    public void pressRequest() {
        System.out.println("request metal button");
    }
}
