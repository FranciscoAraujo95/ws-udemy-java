package application;

import entities.Product;

import javax.swing.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

    public class Program {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of loops: "));
            Product[] product = new Product[n];

            double sum = 0.0;
            for (int i = 0; i < product.length; i++) {

                String name = JOptionPane.showInputDialog(null, "Product " + (i + 1) + " name: ");
                double price =  Double.parseDouble(JOptionPane.showInputDialog(null, "Enter product " + (i + 1) + " price: "));

                product[i] = new Product(name, price);
                sum += product[i].getPrice();

            }

            double avg = sum / product.length;

            JOptionPane.showMessageDialog(null, Arrays.toString(product) + "\n" + "The average price is: " + String.format("%.2f", avg));

            sc.close();

        }

    }
