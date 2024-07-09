package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

/*
Implemente uma classe chamada “ContaBancária” que possua atributos para armazenar o número da conta,
nome do titular e saldo. Adicione métodos para realizar depósitos e saques.
 */
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter name of the titular of the account:  ");
        account.titularName = sc.nextLine();

        System.out.println();

        System.out.print("Enter the amount you wish to add to the account: ");
        double amount = sc.nextDouble();
        account.addBalance(amount);

        System.out.println();

        System.out.print("Enter the amount you wish to withdraw to the account: ");
        double withdrawal = sc.nextDouble();
        account.withdrawBalance(withdrawal);

        System.out.print(account);

        sc.close();

    }
}
