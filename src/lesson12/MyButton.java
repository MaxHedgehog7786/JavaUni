package lesson12;

import java.awt.*;

public class MyButton extends Button implements Drawable<Button>{

    public MyButton(String label) {
        super(label);
    }

    @Override
    public Button draw() {
        this.setSize(100, 100);
        this.setLocation(100, 100);
        this.setBackground(Color.RED);
        return this;
    }
}
