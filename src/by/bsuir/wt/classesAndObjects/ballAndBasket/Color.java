package by.bsuir.wt.classesAndObjects.ballAndBasket;

public enum Color {
    BLUE("blue"),
    GREEN("green"),
    RED("red"),
    ORANGE("orange"),
    WHITE("white"),
    BLACK("black");

    private final String colorValue;

    Color(String colorValue) {
        this.colorValue = colorValue;
    }

    public String getColorValue() {
        return colorValue;
    }

    public static Color find(String curColor) {
        for (Color color : values()) {
            if (color.getColorValue().equalsIgnoreCase(curColor)) {
                return color;
            }
        }
        return null;
    }
}
