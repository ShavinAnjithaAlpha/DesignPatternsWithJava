package behavioralPatterns.strategy;

public class ImageLoader {

    public void processImage(String imageFile, Compressor compressor, Filter filter) {
        compressor.compress(imageFile);
        filter.filter(imageFile);
    }
}
