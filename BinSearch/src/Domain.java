
public interface Domain<T extends Comparable<T>> {
    T getLeft();
    T getRight();
    T getMiddle();
    Domain<T> newDomain(T left, T right);
    boolean isEmpty();
}