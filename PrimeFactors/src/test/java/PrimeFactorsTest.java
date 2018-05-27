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
}
