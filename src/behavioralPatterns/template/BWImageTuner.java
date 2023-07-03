package behavioralPatterns.template;

public class BWImageTuner extends ImageTuner {
    @Override
    protected void applyFilter() {
        System.out.println("apply B&W filter");
    }

    @Override
    protected void compressImage() {
        System.out.println("compress the image using PNG algo");
    }

    @Override
    protected void addTransforms() {
        System.out.println("transform the image 90 degree");
    }
}
