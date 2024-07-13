package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will be on each vector? ");
        int n = sc.nextInt();
        double[] vectA = new double[n];
        double[] vectB = new double[n];
        double[] vectC = new double[n];

        System.out.println("Enter values of vector A: ");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextDouble();
        }

        System.out.println();

        System.out.println("Enter values of vector B: ");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextDouble();
        }

        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Resulting vector: ");
        for (double number : vectC) {
            System.out.printf("%.0f\n", number);
        }

        sc.close();
    }
}

