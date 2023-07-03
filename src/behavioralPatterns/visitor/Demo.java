package behavioralPatterns.visitor;

public class Demo {
    public static void main(String[] args) {
        // create a new HTML document
        HTMLDocument htmlDocument = new HTMLDocument();
        htmlDocument.add(new HeadingNode());
        htmlDocument.add(new AnchorNode());

        // apply new operation on top of the document
        htmlDocument.applyOperation(new HighlightSyntaxOperation());
    }
}
