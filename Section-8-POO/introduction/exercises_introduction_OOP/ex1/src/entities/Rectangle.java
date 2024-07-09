package entities;

public class Rectangle {

    //Attributes
    public double width;
    public double height;

    //Methods
    public double area() {
        //width * height
        return width * height;
    }

    public double perimeter() {
        //p = 2 * (width + height)
        return 2 * (width + height);
    }

    public double diagonal() {
        // c² = a² + b²
        double hypotenuse = Math.pow(width, 2) + Math.pow(height, 2);
        return Math.sqrt(hypotenuse);
    }

    public String toString() {
        return "AREA = " + String.format("%.2f", area())
                + "\nPERIMETER = "
                + String.format("%.2f", perimeter())
                + "\nDIAGONAL = "
                + String.format("%.2f", diagonal());
    }


}
