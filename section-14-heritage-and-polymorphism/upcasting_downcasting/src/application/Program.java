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

        Account acc = new Account(1001, "Maria", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Bob", 0.0, 500.0);

        //UPCASTING -> Pegar um objeto do tipo BusinessAccount (subclasse) e atribui-lo para um tipo Account (Superclasse)
        //É perfeitamente normal você pegar um objeto de subclasse e atribuí-lo para uma variável de superclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Alex", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING - processo inverso. Para converter uma superclasse (acc2) para tipo subclasse é necessário fazer um casting manual, como demonstrado abaixo.

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //Isso aqui vai dar um erro pois a variavel acc3 é SavingsAccount, não BusinessAccount, mas o erro só vai ser mostrado em tempo de compilação
        //BusinessAccount acc5 = (BusinessAccount) acc3;


        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


        sc.close();

    }

}
