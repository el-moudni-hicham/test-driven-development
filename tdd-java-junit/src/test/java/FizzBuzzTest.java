import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    @Test
    public void fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzTest.fizzBuzz(10));
    }
}
