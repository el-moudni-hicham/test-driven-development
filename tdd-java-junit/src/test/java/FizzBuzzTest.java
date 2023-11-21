import dev.moudni.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String word = fizzBuzz.fizzBuzzResult(30);
        assertEquals("FizzBuzz", word);
    }
}
