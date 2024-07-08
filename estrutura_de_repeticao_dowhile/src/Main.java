import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Resolução usando o While
//        char res = 'S';
//        while (res == 'S' || res == 's') {
//            System.out.print("\nInforme a temperatura em Celsius: ");
//            double C = sc.nextDouble();
//            double F = (9.0 * C) / 5.0 + 32.0;
//
//            System.out.printf("Equivalente em Fahrenheit %.1f\n", F);
//
//            System.out.printf("Deseja repetir? (S/N):\t");
//            res = sc.next().charAt(0);
//        }
//
//        System.out.println("Programa encerrado.");


        //Resolução com o dowhile
        char res;
        do {
            System.out.print("\nInforme a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = (9.0 * C) / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit %.1f\n", F);

            System.out.printf("Deseja repetir? (S/N):\t");
            res = sc.next().charAt(0);
        } while (res == 'S' || res == 's');
        System.out.println("Programa encerrado.");

        sc.close();


    }
}