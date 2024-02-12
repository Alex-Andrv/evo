import org.junit.Test;

import java.util.Optional;

import static junit.framework.TestCase.assertEquals;

public class BinSearchTest {
    @Test
    public void testDoubleBinarySearchSqrt() throws Exception {
        BinSearch<Double> search = new BinSearch<>(x -> Math.sqrt( x));
        assertEquals(4, search.search(new DoubleDomain(0., 10.), 2.), 1e-7);
        assertEquals(0, search.search(new DoubleDomain(0., 10.), 0.), 1e-7);
        assertEquals(9, search.search(new DoubleDomain(0., 10.), 3.), 1e-7);
        assertEquals(1024, search.search(new DoubleDomain(0., 10000000.),32.), 1e-7);
    }

    @Test
    public void testIntBinarySearchSqrt() throws Exception {
        BinSearch<Integer> search = new BinSearch<>(x -> x * x);
        assertEquals(9, (int) search.search(new IntDomain(0, 10), 81));
        assertEquals(10, (int) search.search(new IntDomain(0, 100), 100));
        assertEquals(0, (int) search.search(new IntDomain(0, 1000), 0));
    }
}

