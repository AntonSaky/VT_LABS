package task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MatrixTest {

    @Test
    public void createMatrixTest(){
        double[] arr = {1,2,3,4,5};
        double[][] matrix = Matrix.create(arr, arr.length);
        double[][] expected = {
                {1,2,3,4,5},
                {2,3,4,5,1},
                {3,4,5,1,2},
                {4,5,1,2,3},
                {5,1,2,3,4},
        };
        assertArrayEquals(expected, matrix);
    }
}
