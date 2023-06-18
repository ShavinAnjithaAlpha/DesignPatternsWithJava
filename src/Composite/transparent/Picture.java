package Composite.transparent;

import java.util.LinkedList;

public class Picture implements Graphic{

    private final LinkedList<Graphic> graphics = new LinkedList<>();
    @Override
    public void draw() {
        graphics.forEach(Graphic::draw);
    }

    @Override
    public Graphic add(Graphic gr) {
        graphics.add(gr);
        return this;
    }

    @Override
    public void remove(int id) {
        graphics.remove(id);
    }

    @Override
    public void print() {
        graphics.forEach(Graphic::print);
    }
}
