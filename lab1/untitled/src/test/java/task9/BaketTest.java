package task9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaketTest {
    @Test
    public void BallsInBasketTest(){
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(7.5,"red"));
        balls.add(new Ball(5,"blue"));
        balls.add(new Ball(1.3,"green"));
        balls.add(new Ball(0.1,"blue"));
        balls.add(new Ball(25, "blue"));
        boolean exception = false;
        try{
            balls.add(new Ball(-2, "blue"));
        } catch (IllegalArgumentException e){
            exception = true;
        }
        Basket basket = new Basket(balls);
        double weight = basket.getBallsWeight();
        int count = basket.getBlueBallsCount();
        assertTrue(exception);
        assertEquals(38.9,weight);
        assertEquals(3,count);
    }
}
