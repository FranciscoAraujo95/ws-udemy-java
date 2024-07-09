package application;

/*
Crie uma classe chamada “Círculo” que possua um atributo para armazenar o raio
e métodos para calcular a área e o perímetro do círculo.
 */

import entities.Circle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double areaCircle = sc.nextDouble();

        System.out.printf("Area = %.2f\n", Circle.area(areaCircle));
        System.out.printf("Perimeter = %.2f\n", Circle.perimeter(areaCircle));
        System.out.printf("Volume = %.2f\n", Circle.volume(areaCircle));

    }
}
