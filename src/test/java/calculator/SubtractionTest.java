package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class SubtractionTest {

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
    }
}
