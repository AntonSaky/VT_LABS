package task5;

public class IncreasingSequence {
    public static int countMin(int[] sequence) {
        return sequence.length - lengthOfLIncreasingSequence(sequence);
    }

    private static int lengthOfLIncreasingSequence(int[] nums) {
        int[] arr = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = 0, j = len;
            while (i != j) {
                int m = (i + j) / 2;
                if (arr[m] < num)
                    i = m + 1;
                else
                    j = m;
            }
            arr[i] = num;
            if (i == len) ++len;
        }
        return len;
    }
}
