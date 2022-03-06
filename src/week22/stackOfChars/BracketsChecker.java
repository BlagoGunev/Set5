package week22.stackOfChars;

import java.util.Scanner;

public class BracketsChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        inputLine = inputLine.trim();

        StackOfChars stack = new StackOfChars();
         for (char br : inputLine.toCharArray()) {
             if (br == '(' || br == '[' || br == '{') {
                 stack.push(br);
             } else if (br == ')' || br == ']' || br == '}') {
                 if (stack.empty()) {
                     System.out.println("Invalid.");
                     return;
                 }
                 switch (br) {
                     case ')':
                         if (stack.peek() == '(') {
                             stack.pop();
                         } else {
                             System.out.println("Invalid.");
                             return;
                         }
                         break;
                     case ']':
                         if (stack.peek() == '[') {
                             stack.pop();
                         } else {
                             System.out.println("Invalid.");
                             return;
                         }
                         break;
                     case '}':
                         if (stack.peek() == '{') {
                             stack.pop();
                         } else {
                             System.out.println("Invalid.");
                             return;
                         }
                         break;
                 }
             } else {
                 System.out.println("Invalid.");
                 return;
             }
         }

         if (stack.empty()) {
             System.out.println("Valid.");
         } else {
             System.out.println("Invalid.");
         }

    }

}
