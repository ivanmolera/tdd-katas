import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ivanmolera on 12/03/2018.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testWhenMultipleOfThreeThenPrintFizz() {
        String printedValue = fizzBuzz.printNumber(3);
        Assert.assertEquals("Fizz", printedValue);
    }

    @Test
    public void testWhenMultipleOfFiveThenPrintBuzz() {
        String printedValue = fizzBuzz.printNumber(5);
        Assert.assertEquals("Buzz", printedValue);
    }

    @Test
    public void testWhenMultipleOfThreeAndFiveThenPrintFizzBuzz() {
        String printedValue = fizzBuzz.printNumber(15);
        Assert.assertEquals("FizzBuzz", printedValue);
    }

    @Test()
    public void testWhenNotMultipleOfThreeOrFiveThenPrintNumber() {
        int number = 1;
        String printedValue = fizzBuzz.printNumber(number);
        try {
            Integer integerValue = Integer.parseInt(printedValue);
            Assert.assertEquals(String.valueOf(number), integerValue.toString());
        }
        catch(NumberFormatException nfe) {
            Assert.fail("String printed is not a number");
        }
    }
}
