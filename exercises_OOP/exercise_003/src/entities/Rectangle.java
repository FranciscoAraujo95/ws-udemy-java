package entities;

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
