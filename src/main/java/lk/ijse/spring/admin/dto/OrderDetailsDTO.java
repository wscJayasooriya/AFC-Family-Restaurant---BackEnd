package lk.ijse.spring.admin.dto;

import java.io.Serializable;

public class OrderDetailsDTO {

    private int qty;
    private Double gross_Amount;
    private MealDTO mealDTO;
    private OrderDTO orderDTO;

    public OrderDetailsDTO() {
    }

    public OrderDetailsDTO( int qty, Double gross_Amount, MealDTO mealDTO, OrderDTO orderDTO) {
        this.setQty(qty);
        this.setGross_Amount(gross_Amount);
        this.setMealDTO(mealDTO);
        this.setOrderDTO(orderDTO);
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


    public MealDTO getMealDTO() {
        return mealDTO;
    }

    public void setMealDTO(MealDTO mealDTO) {
        this.mealDTO = mealDTO;
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
                ", qty=" + qty +
                ", gross_Amount=" + gross_Amount +
                ", mealDTO=" + mealDTO +
                ", orderDTO=" + orderDTO +
                '}';
    }
}
