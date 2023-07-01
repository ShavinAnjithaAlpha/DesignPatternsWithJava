package behavioralPatterns.iterator;

public interface Iterator<E> {

    boolean hasNext();
    E current();
    void next();

}
