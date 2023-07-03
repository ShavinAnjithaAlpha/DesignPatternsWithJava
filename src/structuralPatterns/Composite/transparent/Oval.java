package structuralPatterns.Composite.transparent;

public class Oval implements Graphic {
    @Override
    public void draw() {
        // draw logic
        System.out.println("This is an oval");
    }

    @Override
    public void print() {
        System.out.println("Oval");
    }
}
