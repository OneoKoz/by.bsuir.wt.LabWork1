package by.bsuir.wt.classesAndObjects.ballAndBasket;

public class Ball {

    private double weight;
    private Color color;

    public Ball() {
    }

    public Ball(double weight, Color color) {
        this.weight = weight < 0 ? 0 : weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
