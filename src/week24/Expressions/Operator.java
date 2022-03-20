package week24.Expressions;

public class Operator implements Comparable<Operator> {

    public char operator;
    private final int priority;

    public Operator(char operator) {
        this.operator = operator;
        switch (operator) {
            case '+', '-' -> priority = 4;
            case '/', '*' -> priority = 5;
            case '^' -> priority = 6;
            default -> priority = -1;
        }
    }

    @Override
    public int compareTo(Operator o) {
        return Integer.compare(this.priority, o.priority);
    }
}
