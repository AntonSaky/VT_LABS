package task7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortArrayTest {
    @Test
    public void sortTest(){
        double[] array = {9,5,4,2,67,89,1,87,0,5,4,-1};
        double[] res = SortArray.sort(array);
        Arrays.sort(array);
        assertArrayEquals(array,res);
    }
}
