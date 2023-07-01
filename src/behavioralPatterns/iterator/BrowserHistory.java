package behavioralPatterns.iterator;

import java.util.ArrayList;

public class BrowserHistory {

    private final ArrayList<String> history = new ArrayList<>();

    public void add(String url) {
        history.add(url);
    }

    public String pop() {
        // get the last index
        int index = history.size() - 1;
        String url = history.get(index);
        history.remove(index);
        return url;
    }

    public Iterator<String> getIterator() {
        return new ListIterator(this);
    }

    // create a ListIterator class
    public class ListIterator implements Iterator {
        private int currentIndex;
        private BrowserHistory browserHistory;
        public ListIterator(BrowserHistory browserHistory) {
            this.browserHistory = browserHistory;
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < browserHistory.history.size();
        }

        @Override
        public String current() {
            return browserHistory.history.get(currentIndex);
        }

        @Override
        public void next() {
            currentIndex++;
        }
    }
}
