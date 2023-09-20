package org.example;

import task9.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(7.5,"red"));
        balls.add(new Ball(5,"blue"));
        balls.add(new Ball(1.3,"green"));
        balls.add(new Ball(0.1,"blue"));
        balls.add(new Ball(25, "blue"));
        Basket basket = new Basket(balls);
        double weight = basket.getBallsWeight();
        int count = basket.getBlueBallsCount();
        System.out.printf("Weight = %f, blue colors = %d", weight, count);
    }
}