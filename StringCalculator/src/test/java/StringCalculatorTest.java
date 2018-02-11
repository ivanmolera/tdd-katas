package test.java;

import main.java.NegativeNotAllowedException;
import main.java.StringCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringCalculatorTest
{
    private StringCalculator calculator;

    @Before
    public void init() {
        calculator = new StringCalculator();
    }

    @Test
    public void whenEmptyStringThenReturnValueIsZero() throws NegativeNotAllowedException
    {
        int result = calculator.add("");
        assertTrue(result == 0);
    }

    @Test
    public void whenOneNumberThenReturnValueIsTheNumber() throws NegativeNotAllowedException
    {
        int result = calculator.add("25");
        assertTrue(result == 25);
    }

    @Test
    public void whenTwoNumbersThenReturnItsSum() throws NegativeNotAllowedException
    {
        int result = calculator.add("2,2");
        assertTrue(result == 4);

        result = calculator.add("2\n2");
        assertTrue(result == 4);
    }

    @Test
    public void whenUnkownAmountOfNumbersThenReturnItsSum() throws NegativeNotAllowedException
    {
        int result = calculator.add("2,2,2,2");
        assertTrue(result == 8);

        result = calculator.add("2\n2\n2\n2");
        assertTrue(result == 8);
    }

    @Test
    public void whenInputIsCorrectThenCorrectValueReturned() throws NegativeNotAllowedException
    {
        int result = calculator.add("1\n2,3");
        assertTrue(result == 6);
    }

    @Test
    public void whenInputHasCustomDelimiterThenCorrectValueReturned() throws NegativeNotAllowedException
    {
        int result = calculator.add("//;\n1;2");
        assertTrue(result == 3);
    }

    @Test(expected = NegativeNotAllowedException.class)
    public void whenInputHasNegativesThenExceptionIsThrown() throws NegativeNotAllowedException
    {
        calculator.add("1,2,-3");
    }
}
