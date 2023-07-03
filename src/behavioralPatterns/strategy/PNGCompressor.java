package behavioralPatterns.strategy;

public class PNGCompressor implements Compressor {
    @Override
    public void compress(String imagePath) {
        System.out.println("compressed the " + imagePath + " as PNG...");
    }
}
