package behavioralPatterns.iterator;

public class Demo {

    public static void main(String[] args) {
        // create a browse history instance
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.add("shyamal");
        browserHistory.add("pytha");
        browserHistory.add("anta");

        for (Iterator<String> iter = browserHistory.getIterator(); iter.hasNext(); iter.next()) {
            System.out.println(iter.current());
        }
    }
}
