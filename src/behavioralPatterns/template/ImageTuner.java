package behavioralPatterns.template;

public abstract class ImageTuner {
    Image image = new Image();

    public void processImage() {
        // load the image
        System.out.println("load the image");
        // apply the filter
        applyFilter();
        // compress the image
        compressImage();
        // add transforms
        addTransforms();
        // close the image file
        System.out.println("image file closed...");

    }

    protected abstract void applyFilter();

    protected abstract void compressImage();

    protected abstract void addTransforms();
}
