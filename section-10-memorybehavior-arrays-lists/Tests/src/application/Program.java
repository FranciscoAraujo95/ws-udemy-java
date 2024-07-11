package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

    public class Program {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of loops: ");
            int n = sc.nextInt();
            Product[] vect = new Product[n];

            double sum = 0.0;
            for (int i = 0; i < vect.length; i++) {

                sc.nextLine();
                System.out.print("Product name: ");
                String name = sc.nextLine();
                System.out.print("Product price: ");
                double price = sc.nextDouble();
                vect[i] = new Product(name, price);
                sum += vect[i].getPrice();

            }

            double avgPrice = sum / vect.length;
            System.out.printf("\nAverage price: $ %.2f\n", avgPrice);


            sc.close();

        }
    }
