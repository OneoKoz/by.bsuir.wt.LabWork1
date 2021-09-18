package by.bsuir.wt.javaFundamental;

public class Task1 {
    public double calculate(double x, double y) {
        return calculateNumerator(x, y) / calculateDenominator(x, y) + x;
    }

    private double calculateNumerator(double x, double y) {
        return 1 + Math.pow(Math.sin(x + y), 2);
    }

    private double calculateDenominator(double x, double y) {
        return 2 + Math.abs(x - 2 * x / (1 + x * x * y * y));
    }
}
