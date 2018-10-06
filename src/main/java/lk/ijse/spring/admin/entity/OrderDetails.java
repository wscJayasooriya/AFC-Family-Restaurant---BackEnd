package lk.ijse.spring.admin.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrderDetails {
    private int qty;
    private Double gross_Amount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mealCode", referencedColumnName = "mealCode", insertable = false, updatable = false)
    private Meal meal;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "o_ID", referencedColumnName = "o_ID",insertable = false,updatable = false)
    private Orders orders;
    @EmbeddedId
    private OrderDetails_PK orderDetails_pk;

    public OrderDetails() {
    }

    public OrderDetails( int qty, Double gross_Amount, Meal meal, Orders orders) {
        this.setQty(qty);
        this.setGross_Amount(gross_Amount);
        this.setMeal(meal);
        this.setOrders(orders);
    }

    public OrderDetails(int qty, Double gross_Amount, Meal meal, Orders orders, OrderDetails_PK orderDetails_pk) {
        this.setQty(qty);
        this.setGross_Amount(gross_Amount);
        this.setMeal(meal);
        this.setOrders(orders);
        this.setOrderDetails_pk(orderDetails_pk);
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Double getGross_Amount() {
        return gross_Amount;
    }

    public void setGross_Amount(Double gross_Amount) {
        this.gross_Amount = gross_Amount;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public OrderDetails_PK getOrderDetails_pk() {
        return orderDetails_pk;
    }

    public void setOrderDetails_pk(OrderDetails_PK orderDetails_pk) {
        this.orderDetails_pk = orderDetails_pk;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "qty=" + qty +
                ", gross_Amount=" + gross_Amount +
                ", meal=" + meal +
                ", orders=" + orders +
                ", orderDetails_pk=" + orderDetails_pk +
                '}';
    }
}
