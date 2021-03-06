package week22.stackOfChars;

public class StackOfChars {
    private char[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /** Construct a stack with the default capacity 16 */
    public StackOfChars() {
        this(DEFAULT_CAPACITY);
    }

    /** Construct a stack with the specified maximum capacity */
    public StackOfChars(int capacity) {
        elements = new char[capacity];
    }

    /** Push a new integer to the top of the stack */
    public void push(char value) {
        if (size >= elements.length) {
            char[] temp = new char[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    /** Return and remove the top element from the stack */
    public char pop() {
        return elements[--size];
    }

    /** Return the top element from the stack */
    public char peek() {
        return elements[size - 1];
    }

    /** Test whether the stack is empty */
    public boolean empty() {
        return size == 0;
    }

    /** Return the number of elements in the stack */
    public int getSize() {
        return size;
    }
}