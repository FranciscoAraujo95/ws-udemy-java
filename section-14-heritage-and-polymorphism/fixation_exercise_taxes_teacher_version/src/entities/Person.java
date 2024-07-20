package entities;

public abstract class Person {

    private String name;
    protected double annualIncome;
    protected double taxIncome;

    public Person() {
    }

    public Person(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getTaxIncome() {
        return taxIncome;
    }

    public void setTaxIncome(double taxIncome) {
        this.taxIncome = taxIncome;
    }

    public abstract double tax();

}
