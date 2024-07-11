package application;

import entities.Product;
import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Triangle x;
//        x = new Triangle();
//
//        System.out.println("Enter the measures of triangle: ");
//        x.a = sc.nextDouble();
//        x.b = sc.nextDouble();
//        x.c = sc.nextDouble();
//
//        x.typeTriangle();

//        -------------------------------------------------------------

        //Instance of the class product
        Product product = new Product();

        //Data input
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        //Data output
        System.out.println(product);
        //Converting the price to BRL, just to see how my Country has abusive taxes LoL. So sad.
        System.out.println("Price in BRL: " + product.convertPriceToRealBRL((5.46)));

        sc.close();

    }
}