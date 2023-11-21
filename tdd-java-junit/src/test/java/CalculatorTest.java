import dev.moudni.Calculator;
import dev.moudni.FizzBuzz;
import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void sumTest() {
        assertEquals(calculator.sum(1, 1), 2);

        int[] l1 = {1, 2, 3};
        int[] l2 = {1, 2, 4};
        //assertArrayEquals(l1, l2);

        assertTrue(calculator.sum(1, 1) == calculator.substract(4, 2));

    }

}
