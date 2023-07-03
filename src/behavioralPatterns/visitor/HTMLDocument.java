package behavioralPatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument {
    private List<HTMLNode> nodes = new ArrayList<>();

    public void add(HTMLNode node) {
        nodes.add(node);
    }

    public void applyOperation(Operation operation) {
        for (HTMLNode node : nodes) {
            node.execute(operation);
        }
    }
}
