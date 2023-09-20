package task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertTest{
        @Test
        public void InsertArraysTest(){
            int[] arr1 = new int[]{1,1,5,9,80,100};
            int[] arr2 = new int[]{0,2,6,90,110,120};
            int[] indexes = Insert.GetIndexes(arr1, arr2);
            assertArrayEquals(new int[]{0,3,5,8,10,11}, indexes);
        }
}
