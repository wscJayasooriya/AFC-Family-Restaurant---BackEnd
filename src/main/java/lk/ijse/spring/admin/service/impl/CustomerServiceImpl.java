package lk.ijse.spring.admin.service.impl;

import lk.ijse.spring.admin.dto.CustomerDTO;
import lk.ijse.spring.admin.entity.Customer;
import lk.ijse.spring.admin.repository.CustomerRepository;
import lk.ijse.spring.admin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        ArrayList<CustomerDTO> alCustomers = new ArrayList<>();

        for (Customer customer : customers) {
            CustomerDTO customerDTO = new CustomerDTO(
                    customer.getCus_Name(),
                    customer.getCus_UName(),
                    customer.getCus_Address(),
                    customer.getCus_Email(),
                    customer.getCus_Contact(),
                    customer.getCus_Password(),
                    customer.getCus_ConfPassword()
            );

            alCustomers.add(customerDTO);
        }

        return alCustomers;
    }


    @Override
    public CustomerDTO getCustomer(String userName) {
        Customer customer = customerRepository.findById(userName).get();
        CustomerDTO customerDTO = new CustomerDTO(
                customer.getCus_Name(),
                customer.getCus_UName(),
                customer.getCus_Address(),
                customer.getCus_Email(),
                customer.getCus_Contact(),
                customer.getCus_Password(),
                customer.getCus_ConfPassword());
        return customerDTO;
    }



    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteCustomer(String userName) {
        customerRepository.deleteById(userName);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveCustomer(CustomerDTO customer) {
        Customer cust= new Customer(
                customer.getCus_Name(),
                customer.getCus_UName(),
                customer.getCus_Address(),
                customer.getCus_Email(),
                customer.getCus_Contact(),
                customer.getCus_Password(),
                customer.getCus_ConfPassword());

        customerRepository.save(cust);

        return true;
    }

    @Override
    public boolean canAuthenticate(String cus_UName, String cus_Password) {
        boolean exists = customerRepository.existsById(cus_UName);
        if (!exists){
            return false;
        }
        Customer cust = customerRepository.findById(cus_UName).get();
        return cust.getCus_Password().equals(cus_Password);
    }

//    @Override
//    public long getTotalCustomers() {
//        return customerRepository.getTotalCustomers();
//    }
}
