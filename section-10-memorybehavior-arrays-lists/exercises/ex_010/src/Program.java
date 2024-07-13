import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdHomens, qtdMulheres;
        double maiorAltura, menorAltura, somaAlturaMulheres, mediaAlturaMulheres;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i + 1);
            generos[i] = sc.next().charAt(0);
        }

        maiorAltura = 0;
        menorAltura = 0;
        for (int i = 0; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }

            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        qtdHomens = 0;
        qtdMulheres = 0;
        somaAlturaMulheres = 0;
        for (int i = 0; i < n; i++) {
            if (generos[i] == 'F' || generos[i] == 'f') {
                qtdMulheres++;
                somaAlturaMulheres += alturas[i];
            } else if (generos[i] == 'M' || generos[i] == 'm') {
                qtdHomens++;
            }
        }

        mediaAlturaMulheres = somaAlturaMulheres / qtdMulheres;

        System.out.printf("Menor altura: %.2f\n", menorAltura);
        System.out.printf("Maior altura: %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
        System.out.print("Quantidade de homens = " + qtdHomens);

        sc.close();
    }
}
