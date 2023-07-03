package structuralPatterns.Composite.transparent;

public interface Graphic {

    void draw(); // draw the graphic in the screen

    // composite methods
    default Graphic add(Graphic gr) {
        return this;
    } // add another graphic into the composite

    default void remove(int id) {
    } // remove graphics from the composite

    void print(); // print the internal data
}
