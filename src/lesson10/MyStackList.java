package lesson10;

import java.util.ArrayList;

public class MyStackList<T> extends ArrayList<T> {

    public int getSize(){
        return super.size();
    }

    public T peek(){
        return super.getLast();
    }

    public T pop(){
        return super.removeLast();
    }

    public void push(T t){
        super.add(t);
    }

}
