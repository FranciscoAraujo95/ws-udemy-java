package util;

public class Calculator {

    //Thw word "final" means that the variable cannot be changed, it's value is constant.
    public final double PI = 3.14159;

    public double circumference(double radius) {
        return 2.00 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3;
    }

}
