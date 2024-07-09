package entities;

/*
Implemente uma classe chamada “ContaBancária” que possua atributos para armazenar o número da conta,
nome do titular e saldo. Adicione métodos para realizar depósitos e saques.
 */
public class BankAccount {

    //Attributes
    public double accountNumber;
    public double bankBalance;
    public String titularName;

    //Methods
    public double addBalance(double value) {
        return bankBalance += value;
    }

    public double withdrawBalance(double value) {
        return bankBalance -= value;
    }

    public String toString() {
        return "Name: "
                + titularName
                + ", current balance = R$ "
                + bankBalance
                + "\n";
    }
}
