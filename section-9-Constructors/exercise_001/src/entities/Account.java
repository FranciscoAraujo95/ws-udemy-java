package entities;

public class Account {

    //Attributes
    private int WITHDRAW_TAX = 5;
    private int number;
    private String holder;
    private double balance;

    //Constructors
    public Account() {
    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    //Methods
    public void addAmount(double amount) {
        this.balance += amount;
    }

    public void withdrawAmount(double amount) {
        this.balance -= amount + WITHDRAW_TAX;
    }

    //Getters & Setters
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public int getWITHDRAW_TAX() {
        return WITHDRAW_TAX;
    }

    public void setWITHDRAW_TAX(int WITHDRAW_TAX) {
        this.WITHDRAW_TAX = WITHDRAW_TAX;
    }

    public String toString() {
        return "Account "
                + this.number
                + ", Holder: "
                + this.holder
                + ", Balance: $ "
                + String.format("%.2f", this.balance);
    }

}
