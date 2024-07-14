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

            System.out.println();
            System.out.printf("Employee #%d:\n", i + 1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary incrase: ");
        int idSalary = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

//        Integer pos = position(list, idSalary);
        if (emp == null) {
            System.out.print("\nThis id does not exists");
        } else {
            System.out.print("\nEnter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    //Aux function to verify of the id exists
    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}
