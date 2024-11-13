package lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("+------------------+         +--------------------+\n" +
                "|    MyStack<T>    |         |  MyStackList<T>    |\n" +
                "+------------------+         +--------------------+\n" +
                "| - list: ArrayList<T> |    | <<extends>> ArrayList<T> |\n" +
                "+------------------+         +--------------------+\n" +
                "| + isEmpty(): boolean       | + getSize(): int          |\n" +
                "| + getSize(): int           | + peek(): T               |\n" +
                "| + peek(): T                | + pop(): T                |\n" +
                "| + pop(): T                 | + push(T t): void         |\n" +
                "| + push(T t): void          |\n" +
                "+------------------+         +--------------------+\n");

        MyStack stack = new MyStack();
        System.out.println("Введите 5 строк: ");
        for (int i = 0; i < 5; i++) {
            stack.push(scanner.nextLine());
        }
        System.out.println("Строки в обратном порядке: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
