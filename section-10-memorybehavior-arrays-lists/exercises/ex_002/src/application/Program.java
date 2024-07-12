package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

    public class Program {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            String response = "y";
            do {
                System.out.print("How many numbers do you want to check? ");
                int n = sc.nextInt();
                double[] vector = new double[n];

                double sum = 0;
                for (int i = 0; i < vector.length; i ++) {
                    System.out.print("Enter a number: ");
                    vector[i] = sc.nextDouble();
                    sum += vector[i];
                }

                double avg = sum / vector.length;

                System.out.println();
                System.out.printf("Values = %s", Arrays.toString(vector));
                System.out.printf("\nSoma = %.2f", sum);
                System.out.printf("\nMedia = %.2f", avg);
                System.out.println();

                System.out.print("\nDo you want to repeat? (y/n) ");
                response = sc.next();
                System.out.println();

                while (!response.equals("y") && !response.equals("n")) {
                    System.out.println();
                    System.out.print("Invalid! Please, enter only 'y' or 'no'.\n"
                            + "Do you want to repeat? ");
                    response = sc.next();
                }

            } while (response.equals("y"));

            System.out.print(">>>>> Program terminated <<<<<");

            sc.close();
        }

    }
