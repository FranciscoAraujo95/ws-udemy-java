package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        int n = sc.nextInt();
        int[] elements = new int[n];

        int sumElements = 0;
        double quantityEven = 0;
        for (int i = 0; i < elements.length; i++) {
            System.out.print("Digit a number: ");
            elements[i] = sc.nextInt();
        }

        for (int element : elements) {
            if (element % 2 == 0) {
                sumElements += element;
                quantityEven++;
            }
        }

        if (quantityEven == 0) {
            System.out.print("\nNo even numbers");
        } else {
            double averageEven = sumElements / quantityEven;

            System.out.printf("\nAverage of even numbers = %.1f", averageEven);
        }

        sc.close();
    }
}
