package lk.ijse.spring.admin.controller;

import lk.ijse.spring.admin.dto.OrderDTO;
import lk.ijse.spring.admin.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/orders")
public class PlaceOrderController {

    @Autowired
    private PlaceOrderService placeOrderService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean placeOrder(@RequestBody OrderDTO orderDTO) {
        System.out.println(orderDTO.getOrderDetailsDTOS()+"vbn");
        System.out.println("controler works");
        return placeOrderService.savePlaceOrder(orderDTO);
    }

}