package test.java;

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
    public void whenEmptyStringThenReturnValueIsZero()
    {
        int result = calculator.add("");
        assertTrue(result == 0);
    }

    @Test
    public void whenOneNumberThenReturnValueIsTheNumber()
    {
        int result = calculator.add("1");
        assertTrue(result == 1);

        result = calculator.add("25");
        assertTrue(result == 25);
    }

    @Test
    public void whenTwoNumbersThenReturnItsSum()
    {
        int result = calculator.add("2,2");
        assertTrue(result == 4);

        result = calculator.add("25,25");
        assertTrue(result == 50);

        result = calculator.add("2\n2");
        assertTrue(result == 4);

        result = calculator.add("25\n25");
        assertTrue(result == 50);
    }

    @Test
    public void whenUnkownAmountOfNumbersThenReturnItsSum()
    {
        int result = calculator.add("2,2,2,2");
        assertTrue(result == 8);

        result = calculator.add("25,25");
        assertTrue(result == 50);

        result = calculator.add("1,1,1,1,1,1,1,1,1,1");
        assertTrue(result == 10);

        result = calculator.add("2\n2\n2\n2");
        assertTrue(result == 8);

        result = calculator.add("25\n25");
        assertTrue(result == 50);

        result = calculator.add("1\n1\n1\n1\n1\n1\n1\n1\n1\n1");
        assertTrue(result == 10);
    }
}
