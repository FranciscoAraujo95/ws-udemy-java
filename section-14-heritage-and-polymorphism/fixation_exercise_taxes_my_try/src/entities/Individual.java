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
    public double taxIncome() {
        if (annualIncome < 20000) {
            taxIncome = 0.15;
        } else {
            taxIncome = 0.25;
        }
        return annualIncome * taxIncome;
    }

    @Override
    public double taxHealth() {
        if (healthExpenditures > 0) {
            taxHealth = 0.5;
        }
        return healthExpenditures * taxHealth;
    }

    @Override
    public double totalTax() {
        return taxIncome() - taxHealth();
    }


}
