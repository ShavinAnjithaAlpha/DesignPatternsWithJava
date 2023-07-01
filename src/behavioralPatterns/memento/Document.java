package behavioralPatterns.memento;

public class Document {
    private String currentContent;

    public Document(String currentContent) {
        this.currentContent = currentContent;
    }

    public DocumentState getState() {
        return new DocumentState(currentContent);
    }

    public void restore(DocumentState state) {
        this.currentContent = state.getDocumentText();
    }

    public String getCurrentContent() {
        return currentContent;
    }

    public void setCurrentContent(String currentContent) {
        this.currentContent = currentContent;
    }
}
