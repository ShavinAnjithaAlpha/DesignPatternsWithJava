package behavioralPatterns.observer;

public class Demo {

    public static void main(String[] args) {
        // create a data source for store the integer data
        DataSource dataSource = new DataSource();
        // create a spreadsheets and charts for the data source
        SpreadSheet sheet1 = new SpreadSheet("sheet 1", dataSource);
        SpreadSheet sheet2 = new SpreadSheet("sheet 2", dataSource);
        SpreadSheet sheet3 = new SpreadSheet("sheet 3", dataSource);
        // create chart for data source
        Chart chart = new Chart("chart 1", dataSource);

        // add observers to the data source
        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(sheet3);
        dataSource.addObserver(chart);

        // change the values of the data source
        dataSource.setValue(10);
    }
}
