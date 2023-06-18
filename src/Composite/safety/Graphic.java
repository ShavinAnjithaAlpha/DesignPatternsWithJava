package Composite.safety;

public interface Graphic {

    void draw();

    public default Image getComposite() {
        return null;
    }


}
