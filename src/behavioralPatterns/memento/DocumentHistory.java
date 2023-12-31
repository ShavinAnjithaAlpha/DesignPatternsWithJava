package behavioralPatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {
    private final List<DocumentState> states = new ArrayList<>();

    public void add(DocumentState state) {
        states.add(state);
    }

    public DocumentState pop() {
        int lastIndex = states.size() - 1;
        DocumentState lastState = states.get(lastIndex);
        states.remove(lastIndex);

        return lastState;
    }
}
