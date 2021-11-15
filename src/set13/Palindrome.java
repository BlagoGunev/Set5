package set13;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inp = scanner.next();
        int inpLen = inp.length();

        for (int i = 0; i <= inpLen / 2; i++) {
            if (inp.charAt(i) != inp.charAt(inpLen - i - 1)) {
                System.out.println("Not a palindrome\n");
                return;
            }
        }

        System.out.println("Is a palindrome");
    }

}
