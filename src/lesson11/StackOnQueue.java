package lesson11;

import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue<T> {
    private final Queue<T> queue1 = new LinkedList<>();
    private final Queue<T> queue2 = new LinkedList<>();

    public void push(T t) {
        queue1.add(t);
    }

    public T pop(){
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        while (!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
        return queue1.poll();
    }

    public T top(){
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        while (!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
        T res =  queue1.peek();
        queue1.add(queue1.poll());
        return res;
    }

    public boolean empty(){
        return queue1.isEmpty();
    }
}
