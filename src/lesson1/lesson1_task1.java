package lesson1;


import java.util.Scanner;

public class lesson1_task1 {
    private static final double ROUBLES_PER_YUAN = 11.91;

    private static double convertYuanToRubles(int yuan) {
        return yuan * ROUBLES_PER_YUAN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в юанях: ");

        int yuan = scanner.nextInt();

        while (yuan < 0){
            System.out.print("Нельзя вводить отрицательные числа! Введите сумму в юанях: ");
            yuan = scanner.nextInt();
        }

        System.out.println(yuan + " юаней = " + (int) Math.floor(convertYuanToRubles(yuan)) + " рублей");
    }
}
