package week22.queueOfIntegers;

public class QueueOfIntegers {

    public static final int DEFAULT_CAPACITY = 8;

    private int[] elements;
    private int capacity;
    private int size;

    public QueueOfIntegers(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        size = 0;
    }

    public QueueOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public void enqueue(int v) {
        if (size >= capacity) {
            capacity *= 2;
            int[] temp = new int[capacity];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int temp = elements[0];
        size--;
        System.arraycopy(elements, 1, elements, 0, size);
        return temp;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
