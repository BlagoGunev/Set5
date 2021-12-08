package set15;
import java.util.Scanner;

public class AtmUI {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (atm.getSelectedID() == -1) {
                System.out.println("Enter an id: ");
                int id = scanner.nextInt();
                atm.setID(id);
                if (atm.getSelectedID() == -1) {
                    System.out.println("Invalid id. Input an id between 0 and 9.");
                }
                continue;
            }

            System.out.println("Main menu\n" +
                    "1: check balance\n" +
                    "2: withdraw\n" +
                    "3: deposit\n" +
                    "4: exit\n" +
                    "Enter a choice: \n");
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice.");
                continue;
            }



        }

    }

}
