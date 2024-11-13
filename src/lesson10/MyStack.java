package lesson10;

import java.util.ArrayList;

public class MyStack<T> implements Cloneable{
    private ArrayList<T> list;

    public MyStack() {
        this.list = new ArrayList<T>();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return list.size();
    }

    public T peek(){
        return list.getLast();
    }

    public T pop(){
        return list.removeLast();
    }

    public void push(T t){
        list.add(t);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MyStack<T> cloneStack = (MyStack<T>) super.clone();
        cloneStack.list = (ArrayList<T>) list.clone();
        return cloneStack;
    }
}
