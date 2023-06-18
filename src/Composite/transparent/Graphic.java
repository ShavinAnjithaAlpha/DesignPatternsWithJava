package Composite.transparent;
public interface Graphic {

    void draw(); // draw the graphic in the screen
    // composite methods
    public default Graphic add(Graphic gr) {
        return this;
    } // add another graphic into the composite

    public default void remove(int id) {
        return;
    } // remove graphics from the composite

    void print(); // print the internal data
}
