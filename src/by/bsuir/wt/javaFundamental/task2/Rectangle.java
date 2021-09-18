package by.bsuir.wt.javaFundamental.task2;

public class Rectangle {
    private final double startX;
    private final double startY;
    private final double endX;
    private final double endY;

    public Rectangle(double x1, double y1, double x2, double y2) {
        startX = Math.min(x1, x2);
        startY = Math.min(y1, y2);
        endX = Math.max(x1, x2);
        endY = Math.max(y1, y2);
    }

    public double getStartX() {
        return startX;
    }

    public double getStartY() {
        return startY;
    }

    public double getEndX() {
        return endX;
    }

    public double getEndY() {
        return endY;
    }
}
