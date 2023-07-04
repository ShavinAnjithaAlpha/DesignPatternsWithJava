package structuralPatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<EBook> books = new ArrayList<>();

    public void add(String fileName) {
        books.add(new ProxyEBook(fileName));
    }

    public void showBook(String fileName) {
        for (EBook book : books) {
            if (book.getFileName().equals(fileName)) {
                book.show();
            }
        }
    }
}
