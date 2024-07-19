package entities;

public class Company extends Person {

    private Integer employeeAmount;

    public Company() {
        super();
    }

    public Company(String name, double annualIncome, Integer employeeAmount) {
        super(name, annualIncome);
        this.employeeAmount = employeeAmount;
    }

    public Integer getEmployeeAmount() {
        return employeeAmount;
    }

    public void setEmployeeAmount(Integer employeeAmount) {
        this.employeeAmount = employeeAmount;
    }

    @Override
    public double taxIncome() {
        if (employeeAmount <= 10) {
            taxIncome = 0.16;
        } else {
            taxIncome = 0.14;
        }
        return annualIncome * taxIncome;
    }

    @Override
    public double taxHealth() {
        return 0;
    }

    @Override
    public double totalTax() {
        return taxIncome() - taxHealth();
    }

}
