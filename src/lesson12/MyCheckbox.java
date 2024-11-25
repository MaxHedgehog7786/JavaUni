package lesson12;

import java.awt.*;

public class MyCheckbox extends Checkbox implements Drawable<Checkbox> {

    public MyCheckbox(String label) {
        super(label);
    }

    @Override
    public Checkbox draw() {
        this.setSize(100, 100);
        this.setLocation(100, 200);
        this.setBackground(Color.BLUE);
        return this;
    }
}
