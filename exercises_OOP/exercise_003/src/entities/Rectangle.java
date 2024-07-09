package entities;
/*
Crie uma classe chamada “Retângulo” que possua atributos para armazenar a largura e a altura.
Implemente métodos para calcular a área e o perímetro do retângulo.
 */
public class Rectangle {

    //Attributes
    public double width, height;

    //Methods
    public static double rectArea(double width, double height) {
        return width * height;
    }

    public static double rectPerimeter(double width, double height) {
        return (width + height) * 2;
    }
}
