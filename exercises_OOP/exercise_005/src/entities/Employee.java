package entities;

public class Employee {

    //Attributes
    private int id;
    private String name, position;
    private double salary;

    //Constructors
    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //Methods
    public void depositSalary(double amount) {
        salary += amount;
    }

    public void withdrawalSalary(double amount) {
        salary -= amount;
    }

    public void increaseSalary(double amount) {
        salary += salary * (amount / 100);
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "\nid: "
                + id
                + ", name: "
                + name
                + ", position: "
                + position
                + ", salary: $ "
                + String.format("%.2f", salary);
    }
}

