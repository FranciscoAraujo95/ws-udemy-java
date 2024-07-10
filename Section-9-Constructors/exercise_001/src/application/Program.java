package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit? (y/n) ");
        String response = sc.next();
        if (response.equals("y")) {
            System.out.print("Enter initial amount value: ");
            double amount = sc.nextDouble();
            acc.addAmount(amount);
        }

        Account account = new Account(accountNumber, holder, acc.getBalance());

        System.out.println("\nAccount data:");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        account.addAmount(deposit);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdrawAmount(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();


    }
}
