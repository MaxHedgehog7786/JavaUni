package lesson12;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public MyButton createButton() {
        return new MyButton("Windows");
    }

    @Override
    public MyCheckbox createCheckbox() {
        return new MyCheckbox("Windows");
    }
}
