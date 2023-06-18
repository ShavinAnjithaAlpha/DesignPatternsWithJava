package AbstractFactory;

public class ClassicButton implements Button {


    @Override
    public void drawImage() {
        System.out.println("draw classic image");
    }

    @Override
    public void drawBorder() {
        System.out.println("draw classic button border");
    }

    @Override
    public void pressRequest() {
        System.out.println("request classic button");
    }
}
