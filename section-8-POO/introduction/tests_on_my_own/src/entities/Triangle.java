package entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public void typeTriangle() {
        String aux;
        if (a > b + c || b > c + a || c > a + b) {
            aux = "Not a triangle";
        } else if (a == b && b == c) {
            aux = "Equilateral";
        } else if (a == b || b == c || c == a) {
            aux = "Isosceles";
        } else {
            aux = "Scalene";
        }

        System.out.println(aux);
    }

}
