package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, approvedStudents;
        double average = 6.00;
        approvedStudents = 0;

        System.out.print("How many students will be checked? ");
        n = sc.nextInt();
        String[] names = new String[n];
        double[] grades1 = new double[n];
        double[] grades2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter name, first and second grades of the %dst student: \n", i + 1);
            sc.nextLine();
            names[i] = sc.nextLine();
            grades1[i] = sc.nextDouble();
            grades2[i] = sc.nextDouble();

            System.out.println();
        }

        System.out.print("Approved students: \n");
        for (int i = 0; i < n; i++) {
            if ((grades1[i] + grades2[i]) / 2 >= average) {
                approvedStudents++;
                System.out.printf("%s\n", names[i]);
            }
        }

        System.out.printf("\nNumber of approved students: %d", approvedStudents);

        sc.close();
    }
}
