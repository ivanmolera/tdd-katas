package main.java;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator
{
    public static final String COMMA_SEPARATOR = ",";
    public static final String NEWLINE_SEPARATOR = "\n";

    public int add(String numbers) throws NegativeNotAllowedException {
        int returnValue = 0;

        if(!"".equals(numbers)) {
            List<String> numbersList = new ArrayList<>();

            String regex = COMMA_SEPARATOR + "|" + NEWLINE_SEPARATOR;

            if(numbers.startsWith("//")) {
                String newDelimiter = numbers.substring(2,3);
                regex += "|" + newDelimiter;
                numbers = numbers.substring(4, numbers.length());
            }

            String[] splittedString = numbers.split(regex);

            String negativeValues = null;
            for (String num : splittedString) {
                Integer value = new Integer(num);
                if(value.intValue() < 0) {
                    negativeValues += " " + num;
                }
            }

            if(negativeValues != null) throw new NegativeNotAllowedException("negatives not allowed" + negativeValues);

            numbersList.addAll(Arrays.asList(splittedString));
            returnValue = numbersList.stream().mapToInt(Integer::parseInt).sum();
        }
        return returnValue;
    }
}
