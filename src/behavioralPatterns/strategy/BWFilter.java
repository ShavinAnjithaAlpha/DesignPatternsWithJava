package behavioralPatterns.strategy;

public class BWFilter implements Filter {
    @Override
    public void filter(String imagePath) {
        System.out.println("apply BW filter...");
    }
}
