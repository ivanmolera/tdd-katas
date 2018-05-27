package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanmolera on 27/05/2018.
 */
public class PrimeFactors {

    public static List<Integer> of(Integer number) {
        List<Integer> factors = new ArrayList<>();

        Integer divisor = 2;
        while(number > 1) {
            while(number % divisor == 0) {
                factors.add(divisor);
                number /= divisor;
            }
            divisor++;
        }

        return factors;
    }
}
