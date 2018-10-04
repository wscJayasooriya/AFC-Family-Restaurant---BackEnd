package lk.ijse.spring.admin.entity;

import javax.persistence.*;

@Entity
public class OrderDetails {

    private int qty;
    private Double gross_Amount;
    private Double d_Charge;
    private String d_Name;
    private String d_Address;
    private String d_tele;
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

    public OrderDetails(int qty, Double gross_Amount, Double d_Charge, String d_Name, String d_Address, String d_tele, Meal meal, Orders orders) {
        this.setQty(qty);
        this.setGross_Amount(gross_Amount);
        this.setD_Charge(d_Charge);
        this.setD_Name(d_Name);
        this.setD_Address(d_Address);
        this.setD_tele(d_tele);
        this.setMeal(meal);
        this.setOrders(orders);
    }

    public OrderDetails(int qty, Double gross_Amount, Double d_Charge, String d_Name, String d_Address, String d_tele, Meal meal, Orders orders, OrderDetails_PK orderDetails_pk) {
        this.setQty(qty);
        this.setGross_Amount(gross_Amount);
        this.setD_Charge(d_Charge);
        this.setD_Name(d_Name);
        this.setD_Address(d_Address);
        this.setD_tele(d_tele);
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

    public Double getD_Charge() {
        return d_Charge;
    }

    public void setD_Charge(Double d_Charge) {
        this.d_Charge = d_Charge;
    }

    public String getD_Name() {
        return d_Name;
    }

    public void setD_Name(String d_Name) {
        this.d_Name = d_Name;
    }

    public String getD_Address() {
        return d_Address;
    }

    public void setD_Address(String d_Address) {
        this.d_Address = d_Address;
    }

    public String getD_tele() {
        return d_tele;
    }

    public void setD_tele(String d_tele) {
        this.d_tele = d_tele;
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
                ", d_Charge=" + d_Charge +
                ", d_Name='" + d_Name + '\'' +
                ", d_Address='" + d_Address + '\'' +
                ", d_tele='" + d_tele + '\'' +
                ", meal=" + meal +
                ", orders=" + orders +
                ", orderDetails_pk=" + orderDetails_pk +
                '}';
    }
}
