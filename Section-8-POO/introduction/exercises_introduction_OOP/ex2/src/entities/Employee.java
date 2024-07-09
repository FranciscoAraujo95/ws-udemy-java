package entities;

public class Employee {

    //Attributes
    public String name;
    public double grossSalary;
    public double tax;

    //Methods
    public double netSalary() {
        return grossSalary - tax;
    }

   public double increaseSalary (double percentage) {
        return percentage / 100;
   }

    public String toString() {
        return "Name: "
                + name
                + "\nGross Salary: "
                + "R$ " + String.format("%.2f", grossSalary)
                + "\nTax: "
                + "R$ " + String.format("%.2f", tax);
    }

}
