import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.printf("Inform your password: ");
//        int rightPassword = sc.nextInt();
//        while (rightPassword != 2002) {
//            System.out.printf("Incorrect password.%nTry again: ");
//            rightPassword = sc.nextInt();
//        }
//
//        System.out.printf("Access granted. Welcome.");

//        ---------------------------------------------------

//        int x, y;
//
//        System.out.printf("X: ");
//        x = sc.nextInt();
//        System.out.printf("Y: ");
//        y = sc.nextInt();
//
//        while (x != 0 && y != 0) {
//
//            if (x > 0 && y > 0) {
//                System.out.printf("Primeiro");
//            } else if (x > 0 && y < 0) {
//                System.out.printf("Segundo");
//            } else if (x < 0 && y < 0) {
//                System.out.printf("Terceiro");
//            } else {
//                System.out.printf("Quarto");
//            }
//
//            System.out.printf("%nX: ");
//            x = sc.nextInt();
//            System.out.println("Y: ");
//            y = sc.nextInt();
//
//        }
//
//        System.out.println("Quadrante inválido");


        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.
         */

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Informe o tipo de combustivel. (1 - Alcool / 2 - Gasolina / 3 - Diesel // 4 - Sair)");
        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            } else if (tipo == 2) {
                gasolina += 1;
            } else if (tipo == 3) {
                diesel += 1;
            }

            System.out.println("Informe o tipo de combustivel. (1 - Alcool / 2 - Gasolina / 3 - Diesel // 4 - Sair)");
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}