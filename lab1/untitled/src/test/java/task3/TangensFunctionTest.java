package task3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TangensFunctionTest {

    @Test
    public void TangensTest(){
        ArrayList<Data> points = TangensFunction.calculateFunction(-2,2,0.1);
        assertEquals(40, points.size());
        assertEquals( 2.18504 , Math.round((points.get(0).value *100000.0))/100000.0, 0.000_000_000_000_001);
        assertEquals(-2.57215, Math.round((points.get(8).value *100000.0))/100000.0, 0.000_000_000_000_001);
        assertEquals(-0.42279, Math.round((points.get(16).value *100000.0))/100000.0, 0.000_000_000_000_001);
        assertEquals(0.42279, Math.round((points.get(24).value *100000.0))/100000.0, 0.000_000_000_000_001);
        assertEquals(2.57215 , Math.round((points.get(32).value *100000.0))/100000.0, 0.000_000_000_000_001);
    }
}
