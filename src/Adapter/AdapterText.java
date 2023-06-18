package Adapter;

public class AdapterText implements Graphics {

    private TextDrawer drawer;

    public AdapterText() {
        this.drawer = new TextDrawer();
    }


    @Override
    public void draw() {
        drawer.drawBoundary();
        drawer.renderGraphics();
    }

    @Override
    public void finalizeGraphics() {
        drawer.finalizeText();
    }
}
