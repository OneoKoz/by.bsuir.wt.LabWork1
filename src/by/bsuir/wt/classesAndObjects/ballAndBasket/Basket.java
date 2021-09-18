package by.bsuir.wt.classesAndObjects.ballAndBasket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {

    private final List<Ball> allBalls = new ArrayList<>();

    public Basket() {
    }

    public Basket(Ball... balls) {
        allBalls.addAll(Arrays.asList(balls));
    }

    public void addBall(Ball ball) {
        allBalls.add(ball);
    }

    public double calculateWeightBlue() {
        double sumWeight = 0;
        for (Ball ball : allBalls) {
            if (ball.getColor().getColorValue().equals(Color.BLUE.getColorValue())) {
                sumWeight += ball.getWeight();
            }
        }
        return sumWeight;
    }

    public int calculateAmountBlue() {
        int count = 0;
        for (Ball ball : allBalls) {
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }
}
