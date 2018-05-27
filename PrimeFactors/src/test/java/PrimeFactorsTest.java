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
        Assert.assertTrue(factors.size() == 1 && factors.get(0) == 2);
    }

}
