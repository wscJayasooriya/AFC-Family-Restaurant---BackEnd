package lk.ijse.spring.admin.service.impl;

import lk.ijse.spring.admin.dto.OrderDTO;
import lk.ijse.spring.admin.dto.OrderDetailsDTO;
import lk.ijse.spring.admin.entity.*;
import lk.ijse.spring.admin.repository.CustomerRepository;
import lk.ijse.spring.admin.repository.MealRepository;
import lk.ijse.spring.admin.repository.OrderDetailsRepository;
import lk.ijse.spring.admin.repository.OrderRepository;
import lk.ijse.spring.admin.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PlaceOrderServiceImpl implements PlaceOrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDetailsRepository detailsRepository;
    @Autowired
    private MealRepository mealRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean savePlaceOrder(OrderDTO orderDTO) {
        Customer customer = customerRepository.findById(orderDTO.getCustomerDTO().getCus_UName()).get();
        Orders orders = new Orders(
                orderDTO.getO_Date(),
                orderDTO.getO_Time(),
                customer
        );
        orderRepository.save(orders);

        List<OrderDetailsDTO> orderDetailsDTOList = orderDTO.getOrderDetailsDTOS();

        for (OrderDetailsDTO orderDetailsDTO : orderDetailsDTOList) {
            Meal meal = mealRepository.findById(orderDetailsDTO.getMealDTO().getMealCode()).get();
            mealRepository.save(meal);

            OrderDetails orderDetails = new OrderDetails();
            orderDetails.setQty(orderDetailsDTO.getQty());
            orderDetails.setGross_Amount(orderDetailsDTO.getGross_Amount());
            orderDetails.setD_Name(orderDetailsDTO.getD_Name());
            orderDetails.setD_Address(orderDetailsDTO.getD_Address());
            orderDetails.setD_tele(orderDetailsDTO.getD_tele());
            orderDetails.setD_Charge(orderDetailsDTO.getD_Charge());
            orderDetails.setMeal(meal);
            orderDetails.setOrders(orders);

            OrderDetails_PK orderDetails_pk = new OrderDetails_PK(
                    meal.getMealCode(),
                    orders.getO_ID());
            orderDetails.setOrderDetails_pk(orderDetails_pk);
            detailsRepository.save(orderDetails);
        }
        return true;
    }
}
