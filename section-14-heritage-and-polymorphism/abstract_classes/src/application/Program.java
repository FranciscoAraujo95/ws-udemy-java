package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));

        double sum = 0;
        for (Account account : list) {
            sum += account.getBalance();
        }

        System.out.printf("Total balance: %.2f\n", sum);

        for (Account account : list) {
            account.deposit(10.0);
            System.out.println(account.getHolder() + ", " + "Balance: " + String.format("%.2f", account.getBalance()));
        }

        sc.close();

    }

}
