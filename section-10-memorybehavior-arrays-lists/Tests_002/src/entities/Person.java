package entities;

public class Person {

    private String name, occupation;
    private double weight, height, imc;
    private int age;

    public Person(String name, int age, String occupation, double weight, double height, double imc) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.weight = weight;
        this.height = height;
        this.imc = imc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "
                + name
                + ", Age: "
                + age
                + ", Occupation: "
                + occupation
                + ", Weight: "
                + weight
                + ", Height: "
                + height
                + ", IMC: "
                + String.format("%.2f\n", imc);
    }
}
