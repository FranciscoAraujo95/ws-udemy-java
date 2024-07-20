package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        method1();
        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("#### INICIO DO METODO 1 ####");
        method2();
        System.out.println("#### INICIO DO METODO 1 ####");
    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("#### INICIO DO METODO 2 ####");
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Invalid position!");
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        System.out.println("#### FIM DO METODO 2 ####");

        sc.close();
    }

}
