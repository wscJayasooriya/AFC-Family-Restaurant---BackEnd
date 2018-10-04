package lk.ijse.spring.admin.service;

import lk.ijse.spring.admin.dto.OrderDTO;

public interface PlaceOrderService {

    public boolean savePlaceOrder(OrderDTO orderDTO);

}
