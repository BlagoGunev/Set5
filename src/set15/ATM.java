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

    public void setID(int selectedID) {
        if (selectedID < 0 || selectedID > 9) {
            return;
        }
        this.selectedID = selectedID;
    }

    public void choice(int option) {

        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                this.selectedID = -1;
                break;
            default:
                break;
        }

    }

}
