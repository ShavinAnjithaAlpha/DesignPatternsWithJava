package structuralPatterns.Bridge;

public class AWindowImp implements WindowImp {

    private final int id;

    public AWindowImp() {
        this.id = 1;
    }

    @Override
    public void drawText() {
        System.out.println("A draw");
    }

    @Override
    public void drawLine() {
        System.out.println("A Line");
    }

    @Override
    public String toString() {
        return "AWindowImp{" +
                "id=" + id +
                '}';
    }
}
