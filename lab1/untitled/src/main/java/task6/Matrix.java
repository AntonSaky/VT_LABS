package task6;

public class Matrix {
    public static double[][] create(double[] arr, int n){
        double[][] matrix = new double[n][n];
        matrix[0] = arr;
        for (int i = 1; i < n; i++) {
            matrix[i] = leftShift(arr, i);
        }
        return matrix;
    }

    private static double[] leftShift(double[] arr,int n){
        double[] result = new double[arr.length];
        System.arraycopy(arr, n, result, 0, arr.length-n);
        System.arraycopy(arr, 0, result, arr.length-n, n);
        return result;
    }
}
