
public class IntDomain implements Domain<Integer> {
    private Integer left;
    private Integer right;
    public IntDomain(Integer left, Integer right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer getLeft() {
        return left;
    }

    @Override
    public Integer getRight() {
        return right;
    }

    @Override
    public Integer getMiddle() {
        return (left + right) / 2;
    }

    @Override
    public Domain<Integer> newDomain(Integer left, Integer right) {
        return new IntDomain(left, right);
    }

    @Override
    public boolean isEmpty() {
        return left + 1 < right;
    }
}
