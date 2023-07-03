package structuralPatterns.Composite.safety;

public interface Graphic {

    void draw();

    default Image getComposite() {
        return null;
    }


}
