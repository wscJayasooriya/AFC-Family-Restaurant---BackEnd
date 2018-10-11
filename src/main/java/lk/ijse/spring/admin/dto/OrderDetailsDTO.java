package lk.ijse.spring.admin.dto;

import java.io.Serializable;

public class OrderDetailsDTO {

    private int qty;
    private Double gross_Amount;
    private MealDTO meal;
    private OrderDTO orderDTO;

    public OrderDetailsDTO() {
    }

    public OrderDetailsDTO(int qty, Double gross_Amount, MealDTO meal, OrderDTO orderDTO) {
        this.qty = qty;
        this.gross_Amount = gross_Amount;
        this.meal = meal;
        this.orderDTO = orderDTO;
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

    public MealDTO getMeal() {
        return meal;
    }

    public void setMeal(MealDTO meal) {
        this.meal = meal;
    }

    public OrderDTO getOrderDTO() {
        return orderDTO;
    }

    public void setOrderDTO(OrderDTO orderDTO) {
        this.orderDTO = orderDTO;
    }

    @Override
    public String toString() {
        return "OrderDetailsDTO{" +
                "qty=" + qty +
                ", gross_Amount=" + gross_Amount +
                ", meal=" + meal +
                ", orderDTO=" + orderDTO +
                '}';
    }
}
