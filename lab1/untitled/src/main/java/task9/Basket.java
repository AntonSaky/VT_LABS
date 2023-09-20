package task9;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Ball> basket;

    public Basket(ArrayList<Ball> collection) {
        basket = new ArrayList<>(collection);
    }

    public double getBallsWeight() {
        double weight = 0;
        for(var ball: basket) {
            weight += ball.weight;
        }
        return weight;
    }

    public int getBlueBallsCount() {
        int count = 0;
        for(var ball: basket) {
            if(ball.color.equals("blue"))
                count++;
        }
        return count;
    }
}
