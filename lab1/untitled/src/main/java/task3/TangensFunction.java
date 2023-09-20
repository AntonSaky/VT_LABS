package task3;

import java.util.ArrayList;

public class TangensFunction {
    public static ArrayList<Data> calculateFunction(double a, double b, double h) {
        ArrayList<Data> dataPoints = new ArrayList<>();
        for (double x = a; x <= b; x += h) {
            double result = Math.tan(x);
            dataPoints.add(new Data(x, result));
        }
        Data.print(dataPoints);
        return dataPoints;
    }
}
