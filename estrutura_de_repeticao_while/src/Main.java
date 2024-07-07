import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();
        int soma = 0;
        while (numero != 0) {
            soma += numero;
            System.out.print("Informe um número: ");
            numero = sc.nextInt();

        }
        System.out.printf("Total somado: %d%n", soma);

        sc.close();

    }
}