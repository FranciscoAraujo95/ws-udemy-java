import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double conta = 50.0;
        System.out.println("Total de minutos utilizados: ");
        int minutos = sc.nextInt();

        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2.0;
        }

        System.out.printf("Total da conta: R$ %.2f%n", conta);

        /*
         * Operadores de atribuição cumulativa
         * +=
         * -=
         * *=
         * /=
         * %=
         * */

    }
}