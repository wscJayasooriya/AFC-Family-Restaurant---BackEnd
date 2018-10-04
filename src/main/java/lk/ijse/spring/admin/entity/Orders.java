package lk.ijse.spring.admin.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int o_ID;
    private String o_Date;
    private String o_Time;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;

    public Orders() {
    }

    public Orders(int o_ID, String o_Date, String o_Time, Customer customer, List<OrderDetails> orderDetails) {
        this.setO_ID(o_ID);
        this.setO_Date(o_Date);
        this.setO_Time(o_Time);
        this.setCustomer(customer);
        this.setOrderDetails(orderDetails);
    }

    public Orders(String o_Date, String o_Time, Customer customer) {
        this.setO_Date(o_Date);
        this.setO_Time(o_Time);
        this.setCustomer(customer);
    }

    public Orders(String o_Date, String o_Time, Customer customer, List<OrderDetails> orderDetails) {
        this.o_Date = o_Date;
        this.o_Time = o_Time;
        this.customer = customer;
        this.orderDetails = orderDetails;
    }

    public int getO_ID() {
        return o_ID;
    }

    public void setO_ID(int o_ID) {
        this.o_ID = o_ID;
    }

    public String getO_Date() {
        return o_Date;
    }

    public void setO_Date(String o_Date) {
        this.o_Date = o_Date;
    }

    public String getO_Time() {
        return o_Time;
    }

    public void setO_Time(String o_Time) {
        this.o_Time = o_Time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "o_ID=" + o_ID +
                ", o_Date='" + o_Date + '\'' +
                ", o_Time='" + o_Time + '\'' +
                ", customer=" + customer +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
