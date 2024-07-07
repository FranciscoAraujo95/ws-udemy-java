import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inform your age: ");
        int age = sc.nextInt();
        String drink = (age >= 18) ? "Can drink" : "Can't drink";
        System.out.println(drink);

        sc.close();

        //Another example
//        double price = 33.45;
//        double descount;
//        if (price < 20) {
//            descount = price * 0.1;
//        } else {
//            descount = price * 0.05;
//        }

        //We could to the same thing this way
        double price = 33.45;
        double discount = (price < 20.0) ? price * 0.1 : price * 0.05;
        System.out.printf("Final price = %.2f%n", price - discount);

    }
}