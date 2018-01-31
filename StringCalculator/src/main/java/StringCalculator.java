package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator
{
    public static final String COMMA_SEPARATOR = ",";
    public static final String NEWLINE_SEPARATOR = "\n";

    public int add(String numbers) {
        int returnValue = 0;

        if(!"".equals(numbers)) {
            List<String> numbersList = new ArrayList<>();

            String[] commaSeparatedNums = numbers.split(COMMA_SEPARATOR);
            for (String num : commaSeparatedNums)
            {
                String[] newlineSeparatedNums = num.split(NEWLINE_SEPARATOR);
                numbersList.addAll(Arrays.asList(newlineSeparatedNums));
            }

            returnValue = numbersList.stream().mapToInt(Integer::parseInt).sum();
        }
        return returnValue;
    }
}
