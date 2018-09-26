package lk.ijse.spring.admin.service;

import lk.ijse.spring.admin.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {

    public ArrayList<CustomerDTO> getAllCustomers();

    public CustomerDTO getCustomer(String userName);

    public boolean deleteCustomer(String userName);

    public boolean saveCustomer(CustomerDTO customer);

    public boolean canAuthenticate(String cus_UName, String cus_Password);

//    public long getTotalCustomers();

}
