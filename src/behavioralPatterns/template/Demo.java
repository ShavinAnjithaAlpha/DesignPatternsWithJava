package behavioralPatterns.template;

public class Demo {

    public static void main(String[] args) {
        // create a ImageTuners
        ImageTuner tuner1 = new BWImageTuner();
        tuner1.processImage();

        System.out.println();
        ImageTuner tuner2 = new AnimeImageTuner();
        tuner2.processImage();
    }
}
