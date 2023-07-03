package behavioralPatterns.observer;

public class SpreadSheet implements Observer {
    private String sheetName;
    private final DataSource dataSource;

    public SpreadSheet(String sheetName, DataSource dataSource) {
        this.sheetName = sheetName;
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("notified the " + sheetName + ": " + dataSource.getValue());
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }
}
