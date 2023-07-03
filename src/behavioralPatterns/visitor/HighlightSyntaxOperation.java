package behavioralPatterns.visitor;

public class HighlightSyntaxOperation implements Operation{
    @Override
    public void apply(HeadingNode node) {
        System.out.println("highlight the heading node");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("highlight the anchor node");
    }
}
