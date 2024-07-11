package entities;

public class Product {

    //Attributes
    public String name;
    public double price;
    public int quantity;

    //Methods
    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public double convertPriceToRealBRL (double real) {
        return price * real;
    }

    public String toString() {
        return "Product data: "
                + name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }

}
