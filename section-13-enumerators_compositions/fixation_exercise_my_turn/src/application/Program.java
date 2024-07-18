package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);


        System.out.println("\nEnter order data: ");
        System.out.print("Status: ");
        sc.nextLine();
        String orderStatus = sc.nextLine();

        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

        System.out.print("\nHow many items to this order? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.printf("\nEnter #%d item data: \n", i + 1);
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            order.addItem(orderItem);

        }

        System.out.println(order);

        sc.close();


    }

}
