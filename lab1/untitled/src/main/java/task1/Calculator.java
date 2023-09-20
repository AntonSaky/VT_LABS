package task1;

public class Calculator {
    public static double solve(double x, double y) {
        return numerator(x, y) / denominator(x, y) + x;
    }

    private static double numerator(double x, double y) {
        return 1 + Math.sin(x+y)*Math.sin(x+y);
    }

    private static double denominator(double x, double y) {
        return 2 + Math.abs(x - (2 * x) / (1 + x*x * y*y));
    }
}
