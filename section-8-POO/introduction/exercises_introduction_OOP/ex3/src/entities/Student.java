package entities;

public class Student {

    //Attributes
    public String name;
    public double a, b, c;
    public double minimumGrade;

    //Constructor
    public Student(double minimumGrade) {
        this.minimumGrade = minimumGrade;
    }

    //Methods
    public double finalGrade() {
        return a + b + c;
    }

}
