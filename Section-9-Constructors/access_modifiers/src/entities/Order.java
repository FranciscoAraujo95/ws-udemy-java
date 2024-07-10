package entities;

import java.util.Date;

public class Order {

    private Date date;
    private Product product;

    public Order(Date date, Product product) {
        super();
        this.date = date;
        this.product = product;
        //This action only is possible because the attribute name on the class Product
        // has no access modifiers and the class Order is int the same package
        this.product.name = "TV";
    }
}
