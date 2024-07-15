package entities;

public class Employee {

    //Attributes
    private Integer id;
    private String name;
    private Double salary;

    //Constructors
    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //Methods
    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    //Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", R$ " + String.format("%.2f", salary);
    }
}
