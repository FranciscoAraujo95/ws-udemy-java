package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.print("How many products? ");
            int n = sc.nextInt();

            Product[] vect = new Product[n];

            for (int i = 0; i < vect.length; i++) {
                System.out.println("Enter product name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter product price: ");
                double price = sc.nextDouble();

                vect[i] = new Product(name, price);
            }

            double sum = 0.0;
            for (int i = 0; i < vect.length; i++) {
                sum += vect[i].getPrice();
            }

            double avg = sum / vect.length;

            System.out.printf("Average price: $ %.2f\n", avg);

            sc.close();

        }
    }
