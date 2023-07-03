package structuralPatterns.Bridge;

public class BWindowImp implements WindowImp {

    private final int id;

    public BWindowImp() {
        this.id = 2;
    }

    @Override
    public void drawText() {
        System.out.println("B draw");
    }

    @Override
    public void drawLine() {
        System.out.println("B Line");
    }

    @Override
    public String toString() {
        return "BWindowImp{" +
                "id=" + id +
                '}';
    }
}
