package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        char escolha = 'y';
        while (escolha == 'y' || escolha == 'Y') {

            System.out.print("Employee name: ");
            emp.name = sc.nextLine();
            System.out.print("Employee salary: ");
            emp.grossSalary = sc.nextDouble();
            System.out.print("Tax: ");
            emp.tax = sc.nextDouble();

            System.out.println();
            System.out.println(emp);

            System.out.println();
            System.out.println("Employee: " + emp.name + ", R$ " + emp.netSalary());

            System.out.println();
            System.out.print("Which percentage to increase salary? ");

            double percent = sc.nextDouble();
            double number = emp.increaseSalary(percent);
            double updatedSalary = emp.netSalary() + (emp.grossSalary * number);

            System.out.println();
            System.out.println("Updated data: " + emp.name + ", R$ " + String.format("%.2f", updatedSalary));

            System.out.println("\nWould you like to continue? (Y/N)");
            escolha = sc.next().charAt(0);
            sc.nextLine();
        }
        System.out.println("Program terminated");
        sc.close();

    }
}
