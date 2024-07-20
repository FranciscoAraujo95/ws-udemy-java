package entities;

public class Company extends Person {

    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10) {
            return annualIncome * 0.14;
        } else {
            return annualIncome * 0.16;
        }
    }

}
