package structuralPatterns.proxy;

public class Demo {
    public static void main(String[] args) {
        // create a libraray
        Library library = new Library();
        library.add("a");
        library.add("b");
        library.add("c");

        library.showBook("a");
    }
}
