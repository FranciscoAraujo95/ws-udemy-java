package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Employee emp;

            System.out.print("Enter employee identification: ");
            int id = sc.nextInt();
            System.out.print("Enter employee name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter employee position: ");
            String position = sc.nextLine();
            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();

            emp = new Employee(id, name, position, salary);
            System.out.println(emp);

            System.out.println();
            System.out.println("Would you like to add values to your salary? (y/n)");
            char response = sc.next().charAt(0);
            if (response == 'y') {
                System.out.print("Enter employee salary: ");
                salary = sc.nextDouble();
                emp.depositSalary(salary);
            } else {
                emp = new Employee(id, name, position, salary);
            }

            System.out.println("Updated salary data: ");
            System.out.println(emp);

            System.out.println();
            System.out.println("Would you like to increase your salary? (y/n)");
            response = sc.next().charAt(0);
            if (response == 'y') {
                System.out.print("Enter the percentage do be increased: ");
                double percentage = sc.nextDouble();
                emp.increaseSalary(percentage);
            } else {
                emp = new Employee(id, name, position, salary);
            }

            System.out.println("Updated salary data: ");
            System.out.println(emp);

            sc.close();

        }
    }
