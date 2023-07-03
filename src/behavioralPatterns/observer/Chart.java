package behavioralPatterns.observer;

public class Chart implements Observer {
    private String chartName;
    private DataSource dataSource;

    public Chart(String chartName, DataSource dataSource) {
        this.chartName = chartName;
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("notified " + chartName + ": " + dataSource.getValue());
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }
}
