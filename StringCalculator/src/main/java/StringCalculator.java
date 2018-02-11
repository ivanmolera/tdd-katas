package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator
{
    public static final String COMMA_SEPARATOR = ",";
    public static final String NEWLINE_SEPARATOR = "\n";
    private String numbers;

    public int add(String numbers) throws NegativeNotAllowedException {
        this.numbers = numbers;
        int returnValue = 0;

        if(!"".equals(numbers)) {
            String delimitersRegex = getDelimitersRegex(numbers);
            String[] splittedString = this.numbers.split(delimitersRegex);

            checkNegativeValues(splittedString);

            List<String> numbersList = new ArrayList<>(Arrays.asList(splittedString));
            returnValue = numbersList.stream().mapToInt(Integer::parseInt).sum();
        }
        return returnValue;
    }

    private String getDelimitersRegex(String numbers) {
        String regex = COMMA_SEPARATOR + "|" + NEWLINE_SEPARATOR;

        if(numbers.startsWith("//")) {
            String newDelimiter = numbers.substring(2,3);
            regex += "|" + newDelimiter;
            this.numbers = numbers.substring(4, numbers.length());
        }
        return regex;
    }

    private void checkNegativeValues(String[] values) throws NegativeNotAllowedException {
        String negativeValues = null;
        for (String num : values) {
            Integer value = new Integer(num);
            if(value.intValue() < 0) {
                negativeValues += " " + num;
            }
        }
        if(negativeValues != null) throw new NegativeNotAllowedException("negatives not allowed" + negativeValues);
    }
}
