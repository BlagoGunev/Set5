package week25;

import java.util.Scanner;
import java.util.Stack;

public class Bubbles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case 'O':
                    if (stack.isEmpty() || stack.peek() != 'L') {
                        stack.push(c);
                    }
                    break;
                case 'L':
                    stack.push(c);
                    break;
                case 'T':
                    while (!stack.isEmpty() && stack.peek() == 'O') {
                        stack.pop();
                    }
                    stack.push(c);
                    break;
                default:
                    break;
            }
        }

        System.out.println(stack.size());
    }

}
