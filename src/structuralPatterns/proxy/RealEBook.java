package structuralPatterns.proxy;

public class RealEBook implements EBook{
    private String fileName;

    public RealEBook(String fileName) {
        this.fileName = fileName;
        loadBook();
    }

    private void loadBook() {
        System.out.println("load the ebook " + fileName);
    }

    @Override
    public void show() {
        System.out.println("show the ebook " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
