import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes vai rodar o loop?");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Informe o valor de X: ");
            int x = sc.nextInt();
            soma += x;
        }

        System.out.printf("%nTotal: %d%n%n", soma);

        //loop crescente
        for (int i = 0; i <= 10; i++) {
            System.out.println("Valor de i crescente: " + i);
        }

        System.out.println();

        //loop descrescente
        for (int i = 10; i > 0; i--) {
            System.out.println("Valor de i descrescente: " + i);
        }

        sc.close();
    }
}