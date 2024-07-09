package entities;

/*
Crie uma classe chamada “Círculo” que possua um atributo para armazenar o raio e métodos para calcular a área e o perímetro do círculo.
 */

public class Circle {

    //Attributes
    public static double PI = 3.14159265359;
    public static double radius;

    //Methods
    public static double area(double radius) {
        //A = 2 * PI * r²
        return 2 * PI * Math.pow(radius, 2);
    }

    public static double perimeter(double radius) {
        //P = 2 * PI * r
        return 2 * PI * radius;
    }

    public static double volume (double radius) {
        //V = 4/3 πr³
        return (float) 4 / 3 * PI * Math.pow(radius, 3);
    }

}
