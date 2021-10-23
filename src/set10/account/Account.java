package set10.account;

import java.util.Date;

public class Account {

    private int id = 0;
    private double balance = 0;
    private static double yearInterestRate = 0;
    private Date dateCreated;

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

    public void setBalance(double balance) {
        this.balance = balance;
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
}
