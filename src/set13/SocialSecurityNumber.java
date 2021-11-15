package set13;
import java.util.Scanner;

public class SocialSecurityNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ssn = scanner.next();

        String output = ssn.matches("^\\d{4}-\\d{2}-\\d{4}$") ? "Valid SSN" : "Invalid SSN";
        System.out.println(output);

    }

}
