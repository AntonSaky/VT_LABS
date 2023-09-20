package task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequenceTest {
    @Test
    public void test(){
        assertEquals(4, IncreasingSequence.countMin(new int[] {30, 40, 2, 5, 1, 7, 45, 50, 8}));
    }

    @Test
    public void testNegative(){
        assertEquals(4, IncreasingSequence.countMin(new int[] {10, 20, -7, 5, -2, 4, 45, 50, -8}));
    }

    @Test
    public void test2(){
        assertEquals(0, IncreasingSequence.countMin(new int[] {1,2,3,4,5,6}));
    }

    @Test
    public void test3(){
        int[] dec = new int[] {10, 9, 8, 7, 6, 5, 4, 1};
        assertEquals(7, IncreasingSequence.countMin(dec));
    }
}
