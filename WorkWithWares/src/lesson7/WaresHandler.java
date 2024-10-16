package lesson7;


import lesson7.Wares.*;

import java.util.Scanner;

public class WaresHandler {
    SmallWares smallWares = new SmallWares();
    MidWares midWares = new MidWares();
    BigWares bigWares = new BigWares();

    public void work(){
        int command = -1;
        Scanner scanner = new Scanner(System.in);
        while (command != 4){
            System.out.println("\nЧто бы вы хотели сделать?\n1) Добавить товар;\n2) Убрать товар;" +
                    "\n3) Вывести остаток;\n4) Закончить работу.");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    System.out.println("Какой товар вы бы хотели добавить?\n1) Маленький;\n2) Средний;\n" +
                            "3) Большой.");
                    command = scanner.nextInt();
                    switch (command){
                        case 1:
                            smallWares.addWare();
                            smallWares.getRemainsInfo();
                            break;
                        case 2:
                            midWares.addWare();
                            midWares.getRemainsInfo();
                            break;
                        case 3:
                            bigWares.addWare();
                            bigWares.getRemainsInfo();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Какой товар вы бы хотели убрать?\n1) Маленький;\n2) Средний;\n" +
                            "3) Большой.");
                    command = scanner.nextInt();
                    switch (command){
                        case 1:
                            smallWares.removeWare();
                            smallWares.getRemainsInfo();
                            break;
                        case 2:
                            midWares.removeWare();
                            midWares.getRemainsInfo();
                            break;
                        case 3:
                            bigWares.removeWare();
                            bigWares.getRemainsInfo();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Остаток каких товаров вы бы хотели посмотреть?\n1) Маленьких;\n2) Средних\n" +
                            "3) Больших.");
                    command = scanner.nextInt();
                    switch (command){
                        case 1:
                            smallWares.getRemainsInfo();
                            break;
                        case 2:
                            midWares.getRemainsInfo();
                            break;
                        case 3:
                            bigWares.getRemainsInfo();
                            break;
                    }
                    break;

            }
        }
    }



}
