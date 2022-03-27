package week25;

import java.util.Scanner;
import java.util.Stack;

public class Sport {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case 'R':
                    if (!stack.isEmpty() && stack.peek() == 'L') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                    break;
                case 'L':
                    stack.push(c);
                    break;
                default:
                    break;
            }
        }

        System.out.println(stack.size());
    }

}
