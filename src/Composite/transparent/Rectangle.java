package Composite.transparent;

public class Rectangle implements Graphic {
    @Override
    public void draw() {
        // draw logic
        System.out.println("This is rectangle");
    }

    @Override
    public void print() {
        System.out.println("Rectangle");
    }
}
