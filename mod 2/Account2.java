public class Account2 {
    String name;
    int accountType;
    int accountNumber;
    float balance;

    // Constructor to initialize the account details
    public Account2(String name, int act, int acn, float bal) {
        this.name = name;
        this.accountType = act;
        this.accountNumber = acn;
        this.balance = bal;
    }

    // Method to deposit money into the account
    public void deposit(int x) {
        balance += x;
    }

    // Method to withdraw money from the account
    public void withdraw(int x) {
        balance -= x;
    }

    // Method to display the current balance
    public void enquire() {
        System.out.println("Balance: " + balance);
    }

    // Main method
    public static void main(String args[]) {
        // Creating an array of Account objects
        Account2 AC[] = new Account2[3];

        // Initializing the account objects with details
        AC[0] = new Account2("Arun", 1, 1234, 100.00f);
        AC[1] = new Account2("Ar", 2, 123, 100.00f);
        AC[2] = new Account2("Arn", 2, 12, 100.00f);

        // Depositing money into each account
        for (int i = 0; i < 3; i++) {
            AC[i].deposit(500);
        }

        // Withdrawing money from each account
        for (int i = 0; i < 3; i++) {
            AC[i].withdraw(500);
        }

        // Enquiring and printing the balance of each account
        for (int i = 0; i < 3; i++) {
            AC[i].enquire();
        }
    }
}
