package application;
import entities.Rent;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rent = new Rent[10];

        System.out.print("How many room will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Rent #%d:\n", i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            rent[roomNumber] = new Rent(name, email);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }

        sc.close();
    }
}
