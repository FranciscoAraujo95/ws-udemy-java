package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.printf("Employee #%d:\n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
            System.out.println();

        }

        System.out.print("Enter the employee id that will have the salary increase: ");
        int idSalary = sc.nextInt();

        Employee empId = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (empId == null) {
            System.out.print("\nThis id does not exists.");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            empId.increaseSalary(percent);
        }

        System.out.println("\nList of employees: ");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }
}
