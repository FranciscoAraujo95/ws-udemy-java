package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you digit? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        int evens = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Evens: \n");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
                evens++;
            }
        }

        System.out.println();
        System.out.printf("\nQuantity of evens = %d", evens);

        sc.close();
    }
}
