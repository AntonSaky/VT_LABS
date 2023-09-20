package task9;

public class Ball {
    public double weight;
    public String color;

    public Ball(double weight, String color) {
        if(weight>0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight must be greater than 0");
        }
        this.color = color;
    }
}
