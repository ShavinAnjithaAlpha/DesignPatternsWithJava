package Composite.transparent;

public class Demo {

    public static void main(String[] args) {
        // create primitive graphic object
        Graphic rectangle = new Rectangle();
        Graphic oval = new Oval();
        Graphic triangle = new Triangle();

        rectangle.draw();
        System.out.println();

        rectangle.add(oval); // nothing happens

        // create a composite picture object
        Picture picture = new Picture();
        picture.add(rectangle).add(triangle).add(oval);

        picture.draw();
        System.out.println();

        // create another picture
        Picture picture1 = new Picture();
        picture1.add(picture).add(new Oval()).add(new Oval()).add(new Rectangle());

        picture1.draw();
        System.out.println();

        // create another composite
        Graphic picture2 = new Picture();
        picture2.add(picture).add(picture1).add(new Rectangle()).add(new Oval()).add(new Rectangle());

        picture2.draw();
    }
}
