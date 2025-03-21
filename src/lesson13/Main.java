package lesson13;

import java.awt.*;

public class Main {
    private final static Color colors[] = {Color.RED, Color.YELLOW, Color.ORANGE, Color.GREEN, Color.BLUE};
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }
    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
