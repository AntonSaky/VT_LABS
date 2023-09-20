package task4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest {

    @Test
    public void FindPrimeNumbers(){
        int[] arr = {0, 1, 853, 2, 997, -5, 5465, 456, 5449, 8};
        ArrayList<Integer> indexes = PrimeNumbers.indexesOfPrimes(arr);
        assertEquals(4,indexes.size());
        assertTrue(indexes.contains(2));
        assertFalse(indexes.contains(5));
        assertTrue(indexes.contains(4));
        assertTrue(indexes.contains(8));
        assertFalse(indexes.contains(1));
    }
}
