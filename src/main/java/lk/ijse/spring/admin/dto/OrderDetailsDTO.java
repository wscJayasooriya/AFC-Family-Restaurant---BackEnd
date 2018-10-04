package lk.ijse.spring.admin.dto;

public class OrderDetailsDTO {

    private int qty;
    private Double gross_Amount;
    private Double d_Charge;
    private String d_Name;
    private String d_Address;
    private String d_tele;
    private MealDTO mealDTO;
    private OrderDTO orderDTO;

    public OrderDetailsDTO() {
    }

    public OrderDetailsDTO(int qty, Double gross_Amount, Double d_Charge, String d_Name, String d_Address, String d_tele, MealDTO mealDTO, OrderDTO orderDTO) {
        this.setQty(qty);
        this.setGross_Amount(gross_Amount);
        this.setD_Charge(d_Charge);
        this.setD_Name(d_Name);
        this.setD_Address(d_Address);
        this.setD_tele(d_tele);
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
                "qty=" + qty +
                ", gross_Amount=" + gross_Amount +
                ", d_Charge=" + d_Charge +
                ", d_Name='" + d_Name + '\'' +
                ", d_Address='" + d_Address + '\'' +
                ", d_tele='" + d_tele + '\'' +
                ", mealDTO=" + mealDTO +
                ", orderDTO=" + orderDTO +
                '}';
    }
}
