package behavioralPatterns.template;

public class AnimeImageTuner extends ImageTuner{
    @Override
    protected void applyFilter() {
        System.out.println("apply cartoon filter");
    }

    @Override
    protected void compressImage() {
        System.out.println("compress the image using JPEG algo");
    }

    @Override
    protected void addTransforms() {
        System.out.println("no transforms add the image");
    }
}
