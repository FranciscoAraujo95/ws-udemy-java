package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import javax.xml.namespace.QName;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.printf("Product #%d data:\n", i + 1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                list.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());

                list.add(new UsedProduct(name, price, manufactureDate));
            } else {
                list.add(new Product(name, price));
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        sc.close();

    }
}
