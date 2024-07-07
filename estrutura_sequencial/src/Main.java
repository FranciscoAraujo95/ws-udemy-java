import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Soma simples
//		int a = 0, b = 0;
//
//		System.out.println("Numero 1: ");
//		a = sc.nextInt();
//		System.out.println("Número 2: ");
//		b = sc.nextInt();
//
//		int soma = a + b;
//
//		System.out.println("SOMA = " + soma);

        // Area de um circulo
        // Formula da area = pi.raio²

//		double pi = 3.14159;
//		double raio = 0;
//
//		System.out.println("Informe o raio do circulo: ");
//		raio = sc.nextDouble();
//
//		double area = pi * Math.pow(raio, 2);
//
//		System.out.printf("Area do circulo: %.4f%n", area);

        // Diferença entre produtos

//		int A, B, C, D;
//
//		System.out.println("N1: ");
//		A = sc.nextInt();
//		System.out.println("N2: ");
//		B = sc.nextInt();
//		System.out.println("N3: ");
//		C = sc.nextInt();
//		System.out.println("N4: ");
//		D = sc.nextInt();
//
//		int resultado = (A * B) - (C * D);
//
//		System.out.printf("DIFERENÇA = %d%n", resultado);

        // Calculo de salário

//		int numeroFunc, numeroHoras;
//		double salario, valorDaHora = 5.50;
//
//		System.out.println("Informe seu ID: ");
//		numeroFunc = sc.nextInt();
//		System.out.println("Quantidade de horas trabalhadas: ");
//		numeroHoras = sc.nextInt();
//
//		salario = numeroHoras * valorDaHora;
//
//		System.out.printf("%nNUMBER = %d%nSALARY = U$ %.2f", numeroFunc, salario);

        // Compra de peças

//		int codigoPeca1, qtdCompradaPeca1, valorPeca1, codigoPeca2, qtdCompradaPeca2, valorPeca2;
//
//		System.out.println("Código peça 1: ");
//		codigoPeca1 = sc.nextInt();
//		System.out.println("Quantidade comprada da peça 1: ");
//		qtdCompradaPeca1 = sc.nextInt();
//		System.out.println("Valor unitario da peça 1: ");
//		valorPeca1 = sc.nextInt();
//
//		int resultado1 = qtdCompradaPeca1 * valorPeca1;
//
////		System.out.println("Valor total da peça 1: R$" + resultado1);
//
//		System.out.println("Código peça 2: ");
//		codigoPeca2 = sc.nextInt();
//		System.out.println("Quantidade comprada da peça 2: ");
//		qtdCompradaPeca2 = sc.nextInt();
//		System.out.println("Valor unitario da peça 2: ");
//		valorPeca2 = sc.nextInt();
//
//		int resultado2 = qtdCompradaPeca2 * valorPeca2;
//
////		System.out.println("Valor total da peça 2: R$" + resultado2);
//
//		int total = resultado1 + resultado2;
//
//		System.out.printf("%nValor total da compra: R$%d%n", total);

        // Calculos geometricos

        double A, B, C;
        double pi = Math.PI;

        System.out.println("Informe o valor de A: ");
        A = sc.nextDouble();
        System.out.println("Informe o valor de B: ");
        B = sc.nextDouble();
        System.out.println("Informe o valor de C: ");
        C = sc.nextDouble();

        double resTriangulo = (A * C) / 2;
        double resCirculo = pi * Math.pow(C, 2);
        double resTrapezio = (A + B) * C / 2;
        double resQuadrado = Math.pow(B, 2);
        double resRetangulo = A * B;

        System.out.printf("%nTRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", resTriangulo, resCirculo, resTrapezio, resQuadrado, resRetangulo);

        sc.close();
    }
}