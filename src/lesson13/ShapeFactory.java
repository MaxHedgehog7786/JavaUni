package lesson13;

import java.awt.*;
import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(Color color) {
        Circle circle = (Circle) circleMap.get(color.toString());
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color.toString(), circle);
            System.out.println("Creating circle of color: " + color.toString());
        }
        return circle;
    }

}
