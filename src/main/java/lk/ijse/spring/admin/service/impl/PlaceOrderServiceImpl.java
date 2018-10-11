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

import java.util.ArrayList;
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
        Customer customer = customerRepository.findById(orderDTO.getCustomerName()).get();


        Orders orders = new Orders();
        System.out.println(1);
        orders.setO_ID(orderDTO.getO_ID());
        orders.setCustomer(customer);
        orders.setO_Date(orderDTO.getO_Date());
        orders.setO_Time(orderDTO.getO_Time());


        List<OrderDetailsDTO> orderDetailsDTOS = orderDTO.getOrderDetailsDTOS();
        System.out.println(orderDetailsDTOS+"--");
        for (OrderDetailsDTO orderDetailsDTO : orderDetailsDTOS) {

            Meal meal = mealRepository.findById(orderDetailsDTO.getMeal().getMealCode()).get();
            System.out.println(meal+"aaaaaaaaaaaas");
            mealRepository.save(meal);

            OrderDetails orderDetails = new OrderDetails();
            //System.out.println(orderDTO.getOrderDetailsDTOS());
            orderDetails.setQty(orderDetailsDTO.getQty());
            orderDetails.setGross_Amount(orderDetailsDTO.getGross_Amount());
            orderDetails.setMeal(meal);
            orderDetails.setOrders(orders);
            orderRepository.save(orders);

            OrderDetails_PK orderDetails_pk = new OrderDetails_PK();

            orderDetails_pk.setMealCode(meal.getMealCode());
            orderDetails_pk.setO_ID(orders.getO_ID());

            orderDetails.setOrderDetails_pk(orderDetails_pk);
            System.out.println(orderDetails+"aaaaaaaa");
            detailsRepository.save(orderDetails);
        }


        orderRepository.save(orders);

        return true;
    }
}
