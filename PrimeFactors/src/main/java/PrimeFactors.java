package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanmolera on 27/05/2018.
 */
public class PrimeFactors {

    public static List<Integer> of(Integer number) {
        List<Integer> factors = new ArrayList<>();

        while(number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }

        if(number > 1) {
            factors.add(number);
        }

        return factors;
    }
}
