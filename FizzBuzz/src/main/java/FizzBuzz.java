/**
 * Created by ivanmolera on 12/03/2018.
 */
public class FizzBuzz {

    private static FizzBuzz fizzBuzz;

    public static void main(String... args) {
        fizzBuzz = new FizzBuzz();
        fizzBuzz.printMany(1, 100);
    }

    public String printNumber(int number) {
        String result = String.valueOf(number);

        if(isFizzBuzz(number)) {
            result = "FizzBuzz";
        }
        else if(isFizz(number)) {
            result = "Fizz";
        }
        else if(isBuzz(number)) {
            result = "Buzz";
        }

        return result;
    }

    public boolean isFizzBuzz(int number) {
        return (number % 3 == 0 && number % 5 == 0);
    }

    public boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    public void printMany(int start, int end) {
        for (int i= start; i<= end; i++) {
            System.out.println(fizzBuzz.printNumber(i));
        }
    }
}
