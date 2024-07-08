import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        System.out.println("Informe o valor de X: ");
//        int x = sc.nextInt();
//        for (int i = 0; i < x; i++) {
//            if (i % 2 != 0) {
//                System.out.println("Valor impar: " + i);
//            }
//        }

//        --------------------------------------------------------

//        System.out.println("Quantos loops?");
//        int n = sc.nextInt();
//        int in = 0;
//        int out = 0;
//        for (int i = 0; i < n; i++) {
//            System.out.print("Digite um numero: ");
//            int number = sc.nextInt();
//            if (number >= 10 && number <= 20) {
//                in += 1;
//            } else {
//                out += 1;
//            }
//        }
//
//        System.out.println(in + " in");
//        System.out.println(out + " out");

//        ------------------------------------------------------------
        //Média ponderada
//        System.out.println("Informe o valor de n: ");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//
//            double a = sc.nextDouble();
//            double b = sc.nextDouble();
//            double c = sc.nextDouble();
//
//            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
//
//            System.out.printf("Média: %.1f%n", media);
//
//        }

//        ------------------------------------------------------------------
        /*
        Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
         */
//        System.out.println("Quantos loops?");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//
//            double x = sc.nextDouble();
//            double y = sc.nextDouble();
//
//            double divisao = x / y;
//
//            if (y != 0) {
//                System.out.println("Divisão de X por Y: " + divisao);
//            } else {
//                System.out.println("Divisão impossível");
//            }
//        }

//        ----------------------------------------------------------------
        //Fatorial
//        System.out.println("Informe o valor de n: ");
//        int n = sc.nextInt();
//        int fatorial = 1;
//        for (int i = 1; i <= n; i++) {
//            fatorial = fatorial * i;
//        }
//        System.out.println(fatorial);

//        -------------------------------------------------------------------
        //Ler um número inteiro N e calcular todos os seus divisores.
//        System.out.println("Informe um numero: ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i);
//            }
//        }
//
//       ------------------------------------------------------------------------

        /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo
         */

        System.out.println("Informe o valor de X: ");
        int x = sc.nextInt();

        if (x > 0) {
            for (int i = 1; i <= x; i++) {

                System.out.printf("Linha %d - %.0f - %.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
            }
        }

        sc.close();

    }
}