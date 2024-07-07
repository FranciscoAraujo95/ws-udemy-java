import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inform your age: ");
        int age = sc.nextInt();
        String drink = (age >= 18) ? "Can drink" : "Can't drink";
        System.out.println(drink);

        sc.close();

    }
}