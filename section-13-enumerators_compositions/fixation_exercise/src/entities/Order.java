package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> itensList = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItensList() {
        return itensList;
    }

    public void setItensList(List<OrderItem> itensList) {
        this.itensList = itensList;
    }

    public void addItem(OrderItem item) {
        itensList.add(item);
    }

    public void removeItem(OrderItem item) {
        itensList.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : itensList) {
            sum += item.getPrice();
        }

        return sum;
    }
}
