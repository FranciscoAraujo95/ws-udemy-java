package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment = new Date();
    private OrderStatus status;

    private Client client;

    private List<OrderItem> orderItemList = new ArrayList<>();

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

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void addItem(OrderItem item) {
        orderItemList.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItemList.remove(item);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem item : orderItemList) {
            sum += item.subtotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("ORDER SUMMARY: ").append("\n");
        sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getName()).append(" (").append(sdfBirth.format(client.getBirthDate())).append(")").append(" - ").append(client.getEmail()).append("\n");
        sb.append("\n");
        sb.append("Order items: ").append("\n");
        for (OrderItem item : orderItemList) {
            sb.append(item.getProduct().getName()).append(", $").append(String.format("%.2f", item.getPrice())).append(", Quantity: ").append(item.getQuantity()).append(", Subtotal: ").append(String.format("%.2f", item.subtotal())).append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));

        return sb.toString();
    }
}
