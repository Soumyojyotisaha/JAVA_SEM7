package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // Getters & Setters for password
    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "apna College";
        account1.email = "soumyojyoti@gmail.com";
        account1.setpassword("abcde");
        
        // Access the private password through the getter method
        System.out.println(account1.getpassword());
    }
}
