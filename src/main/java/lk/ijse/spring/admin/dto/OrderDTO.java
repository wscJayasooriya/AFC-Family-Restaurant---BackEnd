package lk.ijse.spring.admin.dto;

import java.util.List;

public class OrderDTO {

    private int o_ID;
    private String o_Date;
    private String o_Time;
    private CustomerDTO customerDTO;
    private List<OrderDetailsDTO> orderDetailsDTOS;

    public OrderDTO() {
    }

    public OrderDTO(int o_ID, String o_Date, String o_Time, CustomerDTO customerDTO, List<OrderDetailsDTO> orderDetailsDTOS) {
        this.setO_ID(o_ID);
        this.setO_Date(o_Date);
        this.setO_Time(o_Time);
        this.setCustomerDTO(customerDTO);
        this.setOrderDetailsDTOS(orderDetailsDTOS);
    }

    public OrderDTO(String o_Date, String o_Time, CustomerDTO customerDTO, List<OrderDetailsDTO> orderDetailsDTOS) {
        this.setO_Date(o_Date);
        this.setO_Time(o_Time);
        this.setCustomerDTO(customerDTO);
        this.setOrderDetailsDTOS(orderDetailsDTOS);
    }

    public OrderDTO(String o_Date, String o_Time, CustomerDTO customerDTO) {
        this.setO_Date(o_Date);
        this.setO_Time(o_Time);
        this.setCustomerDTO(customerDTO);
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

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public List<OrderDetailsDTO> getOrderDetailsDTOS() {
        return orderDetailsDTOS;
    }

    public void setOrderDetailsDTOS(List<OrderDetailsDTO> orderDetailsDTOS) {
        this.orderDetailsDTOS = orderDetailsDTOS;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "o_ID=" + o_ID +
                ", o_Date='" + o_Date + '\'' +
                ", o_Time='" + o_Time + '\'' +
                ", customerDTO=" + customerDTO +
                ", orderDetailsDTOS=" + orderDetailsDTOS +
                '}';
    }
}
