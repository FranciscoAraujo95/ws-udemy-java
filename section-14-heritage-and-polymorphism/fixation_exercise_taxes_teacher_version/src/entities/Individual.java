package entities;

public class Individual extends Person {

    private double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {

        //double basicTax = (annualIncome < 20000.00) ? annualIncome * 0.15 : annualIncome * 0.25;

        double basicTax;
        if (annualIncome < 20000.0) {
            basicTax = annualIncome * 0.15;
        } else {
            basicTax = annualIncome * 0.25;
        }

        basicTax -= healthExpenditures * 0.5;

        if (basicTax < 0.0) {
            basicTax = 0.0;
        }

        return basicTax;
    }


}
