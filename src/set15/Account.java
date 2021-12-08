package set15;

import java.util.Date;

public class Account {

    private int id = 0;
    private double balance = 0;
    private static double yearInterestRate = 0;
    private final Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {

        if (amount < 0) {
            System.out.println("Cannot withdraw negative amount of money.");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Cannot withdraw. Balance is less than the amount to be withdrawn.");
        }
    }

    public void deposit(double amount) {

        if (amount < 0) {
            System.out.println("Cannot withdraw negative amount of money.");
            return;
        }

        balance += amount;

    }

    public static double getYearInterestRate() {
        return yearInterestRate;
    }

    public static void setYearInterestRate(double yearInterestRate) {
        Account.yearInterestRate = yearInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static double getMonthlyInterestRate() {
        return yearInterestRate/12.0;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }
}
