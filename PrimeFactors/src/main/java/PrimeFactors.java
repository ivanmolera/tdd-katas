package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanmolera on 27/05/2018.
 */
public class PrimeFactors {

    public static List<Integer> of(Integer number) {
        List<Integer> factors = new ArrayList<>();

        if(number == 2) {
            factors.add(2);
        }

        return factors;
    }
}
