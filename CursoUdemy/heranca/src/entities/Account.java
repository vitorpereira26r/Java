package entities;

public class Account {

    private Integer accountNumber;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer accountNumber, String holder, Double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw (Double amount){
        balance -= amount + 5;
    }

    public void deposit (Double amount){
        balance += amount;
    }
}
