package set13;
import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.next();
        int pswrdLen = password.length();
        boolean isAlphanumeric = password.matches("[0-9A-Za-z]*");
        boolean hasAtLeastTwoDigits = password.matches(".*\\d{1}.*\\d+.*");

        String output = (pswrdLen >= 8 && isAlphanumeric && hasAtLeastTwoDigits) ?
                "Valid Password" : "Invalid Password";
        System.out.println(output);

    }

}
