package set15;

public class ATM {

    public Account[] accounts = new Account[10];
    private int selectedID = -1;

    public ATM() {
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }
    }

    public int getSelectedID() {
        return selectedID;
    }

    public void setID(int selectedID) throws IllegalArgumentException {
        if (selectedID < 0 || selectedID > 9) {
            throw new IllegalArgumentException();
        }
        this.selectedID = selectedID;
    }

    public double balance() {
        if (selectedID == -1) {
            throw new IllegalArgumentException();
        }

        return accounts[selectedID].getBalance();
    }

    public void withdraw(double amount) {
        if (selectedID == -1) {
            throw new IllegalArgumentException();
        }

        accounts[selectedID].withdraw(amount);
    }

    public void deposit(double amount) {
        if (selectedID == -1) {
            throw new IllegalArgumentException();
        }

        accounts[selectedID].deposit(amount);
    }

}
