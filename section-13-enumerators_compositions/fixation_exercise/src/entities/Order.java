package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment = new Date();
    private OrderStatus status;

    private Client client;
    private List<OrderItem> itensList = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
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

    public void addItem(OrderItem item) {
        itensList.add(item);
    }

    public void removeItem(OrderItem item) {
        itensList.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : itensList) {
            sum += item.getProduct().getPrice();
        }

        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: ").append("\n");
        sb.append("Order moment: ").append(sdf.format(this.moment)).append("\n");
        sb.append("Order status: ").append(OrderStatus.valueOf(String.valueOf(this.status))).append("\n");
        sb.append("Client: ").append(client.getName()).append(" (").append(sdf1.format(client.getBirthDate())).append(") - ").append(client.getEmail());
        sb.append("\nOrder items:");
        for (OrderItem item : itensList) {
            sb.append(OrderItem.class.toString());
        }
        sb.append("\nTotal Price: $").append(this.total());

        return sb.toString();
    }
}
