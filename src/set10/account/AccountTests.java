package set10.account;

public class AccountTests {

    public static void main(String[] args) {
        Account.setYearInterestRate(0.045);
        Account account = new Account(1122, 20000);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.printf("Balance: %.2f, monthly interest: %.2f", account.getBalance(), account.getMonthlyInterest());
        System.out.println();
        System.out.println("Date created: " + account.getDateCreated());
    }

}
