package lesson11;

public class Main {
    public static void main(String[] args) {
        StackOnQueue<String> stack = new StackOnQueue<>();
        stack.push("Элемент 1");
        stack.push("Элемент 2");
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack.top());
    }
}
