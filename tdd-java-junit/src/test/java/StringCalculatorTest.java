import dev.moudni.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void test1(){
        int result = stringCalculator.add("1,3");
        //assertEquals(0, result);
        assertEquals(4, result);

    }
}
