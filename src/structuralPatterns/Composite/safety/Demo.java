package structuralPatterns.Composite.safety;

public class Demo {

    public static void main(String[] args) {
        // create Rectangles and ovals
        Graphic rectangle = new Rectangle();
        Graphic oval = new Oval();

        if (rectangle.getComposite() != null) {
            rectangle.getComposite().add(oval);
        } else {
            System.out.println("rectangle is not a composite");
        }

        System.out.println();
        Graphic picture = new Image();
        if (picture.getComposite() != null) {
            picture.getComposite().add(rectangle).getComposite().add(oval);
            picture.draw();
        } else {
            System.out.println("picture is not composite");
        }
    }
}
