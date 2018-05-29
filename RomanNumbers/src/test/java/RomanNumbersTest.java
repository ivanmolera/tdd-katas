package test.java;

import main.java.RomanNumbers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by ivanmolera on 28/05/2018.
 */
public class RomanNumbersTest {

    @Test(expected = IllegalArgumentException.class)
    public void of_0throwsException() {
        List<String> romanNumbers = RomanNumbers.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void of_5000throwsException() {
        List<String> romanNumbers = RomanNumbers.convert(5000);
    }

    @Test
    public void of_1isI() {
        List<String> romanNumbers = RomanNumbers.convert(1);
        Assert.assertArrayEquals(new String[]{"I"}, romanNumbers.toArray());
    }
}
