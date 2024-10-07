package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String FIO = scanner.nextLine();

        try {
            Person person = new Person(FIO);
        } catch (Exception e){
            System.out.println(e.getMessage());
            main(new String[]{""});
            return;
        }
        System.out.println("Спасибо, " + FIO + ", все верно!");

    }

}
