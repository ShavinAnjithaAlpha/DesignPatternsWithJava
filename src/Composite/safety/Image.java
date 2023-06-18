package Composite.safety;

import java.util.LinkedList;

public class Image implements Graphic{

    private final LinkedList<Graphic> graphics = new LinkedList<>();
    @Override
    public void draw() {
        graphics.forEach(Graphic::draw);
    }

    @Override
    public Image getComposite() {
        return this;
    }

    public Graphic add(Graphic gr) {
        graphics.add(gr);
        return this;
    }

    public void remove(int id) {
        graphics.remove(id);
    }

    public void iterate() {
        graphics.forEach(System.out::println);
    }


}
