package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String response = "y";
        while (response.equals("y") || response.equals("Y")) {

            System.out.print("How many numbers are you going to digit? ");
            int n = sc.nextInt();
            while (n > 10 || n < 0) {
                System.out.print("\nInvalid! Enter a number between 0 and 10 only: ");
                n = sc.nextInt();
            }

            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter a number: ");
                numbers[i] = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("NEGATIVE NUMBERS: \n");

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    System.out.print(numbers[i] + "\n");
                }
            }

            System.out.print("\nWould you like to repeat? (y/n) ");
            response = sc.next();

            while ((!response.equals("y") && !response.equals("Y")) && (!response.equals("n") && !response.equals("N"))) {
                System.out.print("Invalid! Enter 'y' or 'n' only: ");
                response = sc.next();
            }
            System.out.println();
        }

        System.out.print("Program terminated.\n");

        sc.close();

    }

}
