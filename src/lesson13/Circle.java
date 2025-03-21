package lesson13;

import java.awt.*;

public class Circle implements Shape{
    private Color color;
    private int x;
    private int y;
    private int radius;

    public Circle(Color color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: draw() [Color: " + color + ", x: " + x
                + ", y: " + y + ", radius: " + radius + "]");

    }
}
