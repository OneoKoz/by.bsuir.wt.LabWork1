package by.bsuir.wt;

import by.bsuir.wt.classesAndObjects.ballAndBasket.Ball;
import by.bsuir.wt.classesAndObjects.ballAndBasket.Basket;
import by.bsuir.wt.classesAndObjects.ballAndBasket.Color;
import by.bsuir.wt.javaFundamental.Task5;
import by.bsuir.wt.javaFundamental.task2.Task2;

public class Main {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.isInside(0, 0));
        Task5 task5 = new Task5();
        System.out.println(task5.findMinNumber(new double[]{3, 5, 25, 13, 0, 5, 23, 38, 9, 1}));

        Ball ball1 = new Ball(12, Color.BLACK);
        Ball ball2 = new Ball(15, Color.BLUE);
        Ball ball3 = new Ball(6, Color.GREEN);
        Ball ball4 = new Ball(2.5, Color.RED);
        Ball ball5 = new Ball(1, Color.BLUE);
        Ball ball6 = new Ball(3.0, Color.BLUE);
        Ball ball7 = new Ball(14, Color.GREEN);

        Basket basket = new Basket(ball1, ball2, ball3, ball4, ball5, ball6, ball7);
        System.out.println(basket.calculateWeightBlue());
        System.out.println(basket.calculateAmountBlue());
    }
}
