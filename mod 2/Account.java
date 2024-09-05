public class Account {
    String name;
    int accountType;
    int accountNumber;
    float balance;

    public Account(String name, int act, int acn, float bal) {
        this.name = name;
        this.accountType = act;
        this.accountNumber = acn;
        this.balance = bal;
    }

    public void deposit(int x) {
        balance += x;
    }

    public void withdraw(int x) {
        balance -= x;
    }

    public void enquire() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String args[]) {
        Account AC1 = new Account("arun", 1, 1234,0.0f);
        Account AC2 = new Account("ar", 2, 123, 0.0f);
        Account AC3 = new Account("arn", 2, 12, 0.00f);

        AC1.deposit(500);
        AC2.deposit(500);
        AC3.deposit(500);

        AC1.withdraw(500);
        AC2.withdraw(400);
        AC3.withdraw(400);

        // Enquiring the balances
        AC1.enquire();
        AC2.enquire();
        AC3.enquire();
    }
}
