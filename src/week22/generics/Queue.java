package week22.generics;

import java.util.ArrayList;

public class Queue<E> {

    public static final int DEFAULT_CAPACITY = 8;

    private ArrayList<E> elements;

    public Queue(int capacity) {
        elements = new ArrayList<>(capacity);
    }

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public void enqueue(E v) {
        elements.add(v);
    }

    public E dequeue() {
        E temp = elements.get(0);
        elements.remove(0);
        return temp;
    }

    public boolean empty() {
        return elements.size() == 0;
    }

    public int getSize() {
        return elements.size();
    }

}
