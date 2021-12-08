package set15;
import java.util.Scanner;

public class AtmUI {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an id: ");
            int id = scanner.nextInt();
            try {
                atm.setID(id);
            }
            catch (Exception e) {
                System.out.println("Invalid id. Input an id between 0 and 9");
                continue;
            }

            boolean isSelected = true;

            while(isSelected) {
                System.out.println("""
                        Main menu
                        1: check balance
                        2: withdraw
                        3: deposit
                        4: exit
                        Enter a choice:\s
                        """);
                int choice = scanner.nextInt();
                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice.");
                    continue;
                }

                double balance, amount;
                switch (choice) {
                    case 1:
                        balance = atm.balance();
                        System.out.printf("Balance is %.2f$", balance);
                        break;
                    case 2:
                        System.out.println("Enter an amount to withdraw: ");
                        amount = scanner.nextDouble();
                        atm.withdraw(amount);
                        break;
                    case 3:
                        System.out.println("Enter an amount to deposit: ");
                        amount = scanner.nextDouble();
                        atm.deposit(amount);
                        break;
                    case 4:
                        isSelected = false;
                        break;
                    default:
                        break;
                }
            }

        }

    }

}
