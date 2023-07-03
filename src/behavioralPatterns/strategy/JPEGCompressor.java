package behavioralPatterns.strategy;

public class JPEGCompressor implements Compressor {
    @Override
    public void compress(String imagePath) {
        System.out.println("compressed the " + imagePath + " as JPEG...");
    }
}
