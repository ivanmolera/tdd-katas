package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanmolera on 28/05/2018.
 */
public class RomanNumbers {
    public static List<String> convert(Integer number) throws IllegalArgumentException {
        if(0 <= number || number > 4999) {
            throw new IllegalArgumentException();
        }
        return new ArrayList<>();
    }
}
