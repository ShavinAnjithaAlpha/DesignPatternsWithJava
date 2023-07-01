package behavioralPatterns.memento;

public class Demo {

    public static void main(String[] args) {
        // create a document instance
        Document document = new Document("");
        DocumentHistory history = new DocumentHistory();

        // change the state of the document
        document.setCurrentContent("abc");
        history.add(document.getState());

        document.setCurrentContent("bcd");
        history.add(document.getState());

        document.setCurrentContent("def");
        history.add(document.getState());
        System.out.println("document after modification: " + document.getCurrentContent());

        // restore the states
        document.restore(history.pop());
        document.restore(history.pop());
        System.out.println("Document after two undo: " + document.getCurrentContent());

    }
}
