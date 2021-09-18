package by.bsuir.wt.javaFundamental.task2;

public class Task2 {
    private final Rectangle upperRect = new Rectangle(0, 0, 4, 5);
    private final Rectangle lowerRect = new Rectangle(0, 0, 6, -3);

    public boolean isInside(double x, double y) {
        if (y > 0) {
            return y<upperRect.getEndY()&&Math.abs(x)<upperRect.getEndX();
        } else {
            return y>lowerRect.getStartY()&&Math.abs(x)<lowerRect.getEndX();
        }
    }
}
