package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanmolera on 28/05/2018.
 */
public class RomanNumbers {
    public static List<String> convert(int number) throws IllegalArgumentException {
        if(number <= 0 || number > 4999) {
            throw new IllegalArgumentException();
        }
        List<String> romanRepresentation = new ArrayList<>();
        if(number == 1) {
            romanRepresentation.add("I");
        }
        return romanRepresentation;
    }
}
