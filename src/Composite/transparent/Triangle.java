package Composite.transparent;

public class Triangle implements Graphic{
    @Override
    public void draw() {
        // draw logic
        System.out.println("This is a triangle");
    }

    @Override
    public void print() {
        System.out.println("Triangle");
    }
}
