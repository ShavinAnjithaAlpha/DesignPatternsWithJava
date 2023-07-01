package behavioralPatterns.memento;

public class DocumentState {

    private final String documentText;

    public DocumentState(String documentText) {
        this.documentText = documentText;
    }

    public String getDocumentText() {
        return documentText;
    }
}
