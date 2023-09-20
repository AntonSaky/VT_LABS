package task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    @ParameterizedTest(name = "Test {index}: x = {0} and y = {1}")
    @CsvSource({
            "0, 0, 0.5",
            "1, 2, 1.3922749448749296",
            "-5, 5, -4.856816102470265",
            "10000, -1000000, 10000.000138354459",
            "1000000, 15378, 1000000.000001192",
    })
    public void calculatorTest(double x, double y, double answer) {
        assertEquals(answer, Calculator.solve(x,y), 0.000_000_1);
    }
}
