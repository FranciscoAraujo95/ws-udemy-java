package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number os lines and columns of the matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int count = 0;

        System.out.println("Enter the digits separated by space: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("\nMain diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println("\nNegative numbers: " + count);

        sc.close();
    }
}
