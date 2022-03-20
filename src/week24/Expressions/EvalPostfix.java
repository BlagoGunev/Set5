package week24.Expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class EvalPostfix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(evalPostfix(input));

        input = scanner.nextLine();
        input = infixToPostfix(input);
        System.out.println(input);
    }

    public static int evalPostfix(String input) {
        ArrayList<String> postfix = new ArrayList<>(Arrays.stream(input.split(" ")).filter(s -> !s.isEmpty()).toList());

        Stack<Integer> operands = new Stack<>();
        for (String el : postfix) {
            try {
                int operand = Integer.parseInt(el);
                operands.add(operand);
            } catch (Exception e) {
                switch (el) {
                    case "+":
                        int b = operands.pop();
                        int a = operands.pop();
                        a = a + b;
                        operands.add(a);
                        break;
                    case "-":
                        b = operands.pop();
                        a = operands.pop();
                        a = a - b;
                        operands.add(a);
                        break;
                    case "*":
                        b = operands.pop();
                        a = operands.pop();
                        a = a * b;
                        operands.add(a);
                        break;
                    case "/":
                        b = operands.pop();
                        a = operands.pop();
                        a = a / b;
                        operands.add(a);
                        break;
                    case "^":
                        b = operands.pop();
                        a = operands.pop();
                        a = (int) Math.pow(a, b);
                        operands.add(a);
                        break;
                    default:
                        break;
                }
            }
        }
        return operands.peek();
    }

    public static String infixToPostfix(String expression) {
        StringBuilder stringBuilder = new StringBuilder();

        Stack<Operator> operators = new Stack<>();
        ArrayList<String> elements = new ArrayList<>(Arrays.stream(insertBlanks(expression).split(" ")).filter(s -> !s.isEmpty()).toList());
        for (String el : elements) {
            try {
                int operand = Integer.parseInt(el);
                stringBuilder.append(operand).append(" ");
            } catch (Exception e) {
                Operator operator = new Operator(el.charAt(0));
                if (el.equals("(")) {
                    operators.push(operator);
                } else if (el.equals(")")) {
                    while (!operators.isEmpty() && operators.peek().operator != '(') {
                        stringBuilder.append(operators.peek().operator).append(" ");
                        operators.pop();
                    }
                    operators.pop();
                } else {
                    while (!operators.isEmpty() && operators.peek().compareTo(operator) >= 0) {
                        stringBuilder.append(operators.peek().operator).append(" ");
                        operators.pop();
                    }
                    operators.add(operator);
                }
            }
        }
        while (!operators.isEmpty()) {
            stringBuilder.append(operators.peek().operator).append(" ");
            operators.pop();
        }

        return stringBuilder.toString();
    }

    public static String insertBlanks(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/')
                result.append(" ").append(s.charAt(i)).append(" ");
            else
                result.append(s.charAt(i));
        }
        return result.toString();
    }
}
