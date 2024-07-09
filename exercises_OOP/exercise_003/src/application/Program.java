package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;
/*
Crie uma classe chamada “Retângulo” que possua atributos para armazenar a largura e a altura.
Implemente métodos para calcular a área e o perímetro do retângulo.
 */
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("Enter the measures of the rectangle: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("Area = %.2f\n", Rectangle.rectArea(rect.width, rect.height));
        System.out.printf("Perimeter = %.2f\n", Rectangle.rectPerimeter(rect.width, rect.height));

    }
}
