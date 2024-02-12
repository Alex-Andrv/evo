import java.util.function.Function;

public class BinSearch<T extends Comparable<T>> {
    private Function<T, T> function;
    public BinSearch(Function<T, T> function) {
        this.function = function;
    }

    public T search(Domain<T> domain, T val) throws Exception {
        if (domain.getLeft().compareTo(domain.getRight()) > 0) {
            throw new Exception("Invalid domain: left < right");
        }

        if (function.apply(domain.getLeft()).compareTo(val) > 0) {
            throw new Exception("Invalid domain: f(left) < val");
        }

        if (function.apply(domain.getRight()).compareTo(val) <= 0) {
            throw new Exception("Invalid domain: f(right) >= val");
        }

        while (domain.isEmpty()) {
            T mid = domain.getMiddle();
            T mid_val = function.apply(mid);
            if (mid_val.compareTo(val) <= 0) {
                domain = domain.newDomain(mid, domain.getRight());
            } else {
                domain = domain.newDomain(domain.getLeft(), mid);
            }
        }
        return domain.getLeft();
    }
}
