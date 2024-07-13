package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements the vector will have? ");
        int n = sc.nextInt();
        double[] elements = new double[n];
        double sumElements = 0;
        for (int i = 0; i < elements.length; i++) {
            System.out.print("Enter a number: ");
            elements[i] = sc.nextDouble();
            sumElements += elements[i];
        }

        System.out.println();

        double averageElements = sumElements / elements.length;
        System.out.printf("Average of vector elements: %.3f\n", averageElements);
        System.out.print("Elements below average: \n");
        for (double element : elements) {
            if (element < averageElements) {
                System.out.println(element);
            }
        }

        sc.close();
    }
}
