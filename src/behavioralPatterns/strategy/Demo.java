package behavioralPatterns.strategy;

public class Demo {

    public static void main(String[] args) {
        // create image loader
        ImageLoader imageLoader = new ImageLoader();
        imageLoader.processImage("image.raw", new PNGCompressor(), new BWFilter());
        imageLoader.processImage("image.raw", new JPEGCompressor(), new VividFilter());
    }
}
