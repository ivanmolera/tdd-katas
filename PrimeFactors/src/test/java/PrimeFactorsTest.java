package test.java;

import main.java.PrimeFactors;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by ivanmolera on 27/05/2018.
 */
public class PrimeFactorsTest {

    @Test
    public void of_1isNone() throws Exception {
        List<Integer> factors = PrimeFactors.of(1);
        Assert.assertTrue(factors.size() == 0);
    }

    @Test
    public void of_2is2() throws Exception {
        List<Integer> factors = PrimeFactors.of(2);
        Assert.assertArrayEquals(new Integer[]{2}, factors.toArray());
    }

    @Test
    public void of_3is3() throws Exception {
        List<Integer> factors = PrimeFactors.of(3);
        Assert.assertArrayEquals(new Integer[]{3}, factors.toArray());
    }

    @Test
    public void of_4is2_2() throws Exception {
        List<Integer> factors = PrimeFactors.of(4);
        Assert.assertArrayEquals(new Integer[]{2, 2}, factors.toArray());
    }

    @Test
    public void of_5is5() throws Exception {
        List<Integer> factors = PrimeFactors.of(5);
        Assert.assertArrayEquals(new Integer[]{5}, factors.toArray());
    }

    @Test
    public void of_6is2_3() throws Exception {
        List<Integer> factors = PrimeFactors.of(6);
        Assert.assertArrayEquals(new Integer[]{2, 3}, factors.toArray());
    }

    @Test
    public void of_7is7() throws Exception {
        List<Integer> factors = PrimeFactors.of(7);
        Assert.assertArrayEquals(new Integer[]{7}, factors.toArray());
    }

    @Test
    public void of_8is2_2_2() throws Exception {
        List<Integer> factors = PrimeFactors.of(8);
        Assert.assertArrayEquals(new Integer[]{2, 2, 2}, factors.toArray());
    }
}
