package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<OrderItem> itensList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(clientName, clientEmail, birthDate);

        System.out.println("\nEnter order data: ");
        System.out.print("Status: ");
        String orderStatus = sc.next();

        System.out.print("\nHow many items to this order? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.printf("Enter #%d item data: \n", i + 1);
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            System.out.println();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, product.getPrice(), product);

            itensList.add(orderItem);

        }

        Order order = new Order(OrderStatus.valueOf(orderStatus), client);
        System.out.println(order);


        sc.close();
    }

}
