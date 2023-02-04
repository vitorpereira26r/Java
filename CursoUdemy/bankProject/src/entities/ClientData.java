package entities;

public class ClientData {

    private final int  accountNumber;
    private String name;
    private double balance;

    public ClientData (int accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName () {
        return name;
    }

    public double getBalance () {
        return balance;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void deposit (double depositValue) {
        balance += depositValue;
    }

    public void withdraw (double withdrawValue) {
        balance -= withdrawValue + 5;
    }

    public String toString () {
        return "Account: "
                + accountNumber
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
