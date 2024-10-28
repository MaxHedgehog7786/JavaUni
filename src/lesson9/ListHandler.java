package lesson9;

import java.util.ArrayList;

public class ListHandler {
    ArrayList<A> list;

    public ListHandler() {
        list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new A(i));
            list.add(new B(i));
            list.add(new C(i));
            list.add(new D(i));
        }
        System.out.print("Список выглядит так: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public void printWithoutA(){
        for (int i = 0; i < 12; i++) {
            if(list.get(i).toString().toCharArray()[0] != 'A'){
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }

    public void printWithoutB(){
        for (int i = 0; i < 12; i++) {
            if(list.get(i).toString().toCharArray()[0] != 'B'){
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }

    public void printWithoutC(){
        for (int i = 0; i < 12; i++) {
            if(list.get(i).toString().toCharArray()[0] != 'C'){
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }

    public void printWithoutD(){
        for (int i = 0; i < 12; i++) {
            if(list.get(i).toString().toCharArray()[0] != 'D'){
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }

}
