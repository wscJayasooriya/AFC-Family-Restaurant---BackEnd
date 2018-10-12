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
    private String d_Name;
    private String d_Address;
    private String d_Tele;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;

    public Orders() {
    }

    public Orders(int o_ID, String o_Date, String o_Time, String d_Name, String d_Address, String d_Tele, Customer customer, List<OrderDetails> orderDetails) {
        this.o_ID = o_ID;
        this.o_Date = o_Date;
        this.o_Time = o_Time;
        this.d_Name = d_Name;
        this.d_Address = d_Address;
        this.d_Tele = d_Tele;
        this.customer = customer;
        this.orderDetails = orderDetails;
    }

    public Orders(String o_Date, String o_Time, String d_Name, String d_Address, String d_Tele, Customer customer, List<OrderDetails> orderDetails) {
        this.o_Date = o_Date;
        this.o_Time = o_Time;
        this.d_Name = d_Name;
        this.d_Address = d_Address;
        this.d_Tele = d_Tele;
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

    public String getD_Tele() {
        return d_Tele;
    }

    public void setD_Tele(String d_Tele) {
        this.d_Tele = d_Tele;
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
                ", d_Name='" + d_Name + '\'' +
                ", d_Address='" + d_Address + '\'' +
                ", d_Tele='" + d_Tele + '\'' +
                ", customer=" + customer +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
