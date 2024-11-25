package lesson12;

import java.awt.*;

public class Application {
    private final Button btn;
    private final Checkbox checkbox;
    private final Frame frame;



    public Application(){
        GUIFactory guiFactory;
        if (System.getProperty("os.name").contains("Windows")){
            guiFactory = new WindowsGUIFactory();
        } else {
            guiFactory = new MacGUIFactory();
        }
        btn = guiFactory.createButton().draw();
        checkbox = guiFactory.createCheckbox().draw();
        frame = new Frame();
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.add(btn);
        frame.add(checkbox);
    }

    public void run(){
        frame.setVisible(true);
    }
}
