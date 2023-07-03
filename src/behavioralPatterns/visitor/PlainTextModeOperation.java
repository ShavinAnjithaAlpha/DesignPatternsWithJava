package behavioralPatterns.visitor;

public class PlainTextModeOperation implements Operation {
    @Override
    public void apply(HeadingNode node) {
        System.out.println("apply the plain text mode to the heading...");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("apply the plain text mode to the anchor...");
    }
}
