package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

    public class Program {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

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

            sc.close();
        }

    }
