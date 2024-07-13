package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maiorIdade, posicaoMaior;

        System.out.print("How many people are you going to digit? ");
        n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Data of the %da person: \n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
        }

        maiorIdade = ages[0];
        posicaoMaior = 0;

        for (int i = 0; i < n; i++) {
            if (ages[i] > maiorIdade) {
                maiorIdade = ages[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("Oldest person: %s", names[posicaoMaior]);

        sc.close();
    }
}
