package lesson12;


public class MacGUIFactory implements GUIFactory {
    @Override
    public MyButton createButton() {
        return new MyButton("MacOS");
    }

    @Override
    public MyCheckbox createCheckbox() {
        return new MyCheckbox("MacOS");
    }
}
