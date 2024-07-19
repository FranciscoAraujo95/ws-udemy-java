package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc =  new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 10.0, 500.0);

        //UPCASTING - Process of converting a subclass object to a superclass object
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 100.0, 0.05);

        //DOWN CASTING - The inverse of upcasting lol
        //Manual casting to force the conversion
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            System.out.println(acc5.getBalance());
            acc5.updateBalance();
            System.out.print("Update ");
            System.out.printf("%s%% !\n", acc5.getInterestRate().toString().substring(3));
            System.out.println(acc5.getBalance());
        }

        sc.close();
    }

}
