package set7.savings;

public class SavingsAccount {

    public double balance;
    public double interestRate = 0.01;
    public String name;

    public SavingsAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double x) {
        balance += x;
    }

    public void withdraw(double x) {
        if (x > balance) {
            System.out.println("Balance too low.");
        }

        if (x < 0) {
            System.out.println("Amount to withdraw is negative.");
        }

        balance -= x;
        System.out.println("Balance: " + balance);
    }

}
