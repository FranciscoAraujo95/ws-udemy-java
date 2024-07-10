package entities;

public class Account {

  //Attributes
  private int number;
  private String holder;
  private double balance;

  //Constructors
  public Account(int number, String holder) {
    this.number = number;
    this.holder = holder;
  }

  public Account(int number, String holder, double initialDeposit) {
    this.number = number;
    this.holder = holder;
    deposit(initialDeposit);
  }

  //Methods
  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount + 5;
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

}
