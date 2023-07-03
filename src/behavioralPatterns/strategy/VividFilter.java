package behavioralPatterns.strategy;

public class VividFilter implements Filter {
    @Override
    public void filter(String imagePath) {
        System.out.println("apply vivid method");
    }
}
