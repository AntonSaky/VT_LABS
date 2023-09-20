package task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AreaTest {

    @ParameterizedTest(name = "Test {index}, x={0}, y={1}")
    @CsvSource({
            "-3, -2, true",
            "-5, 8, false",
            "-6, 0, true",
            "4, 4, true",
            "0, -4, false"

    })
    public void isInAreaTest(double x, double y, boolean answer){
        Area area = new Area();
        assertEquals(answer, area.isInArea(x, y));
    }
}
