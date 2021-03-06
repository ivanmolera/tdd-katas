package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanmolera on 27/05/2018.
 */
public class PrimeFactors {

    public static List<Integer> of(Integer number) {
        List<Integer> factors = new ArrayList<>();
        for(int divisor = 2; number > 1; divisor++)
            for( ; number % divisor == 0; number /= divisor)
                factors.add(divisor);
        return factors;
    }
}
