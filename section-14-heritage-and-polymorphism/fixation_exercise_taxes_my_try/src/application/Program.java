package application;

import entities.Company;
import entities.Individual;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n =  sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.printf("Tax payer #%d data: \n", i + 1);
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (ch == 'i') {

                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                Individual ind = new Individual(name, annualIncome, healthExpenditures);
                list.add(ind);

            } else {

                System.out.print("Number of employees: ");
                int employeeNumber = sc.nextInt();

                Company com = new Company(name, annualIncome, employeeNumber);
                list.add(com);

            }

        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        double sum = 0;
        for (Person p : list) {
            System.out.println(p.getName() + ": $ "+ String.format("%.2f",p.totalTax()));
            sum += p.totalTax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + sum);


        sc.close();

    }

}
