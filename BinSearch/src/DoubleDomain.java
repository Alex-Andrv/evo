public class DoubleDomain implements Domain<Double> {
    private Double left;
    private Double right;
    public DoubleDomain(Double left, Double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Double getLeft() {
        return left;
    }

    @Override
    public Double getRight() {
        return right;
    }

    @Override
    public Double getMiddle() {
        return (left + right) / 2;
    }

    @Override
    public Domain<Double> newDomain(Double left, Double right) {
        return new DoubleDomain(left, right);
    }

    @Override
    public boolean isEmpty() {
        return (right - left) > 1e-9;
    }
}
