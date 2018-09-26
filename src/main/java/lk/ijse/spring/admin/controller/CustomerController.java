package lk.ijse.spring.admin.controller;

import lk.ijse.spring.admin.dto.CustomerDTO;
import lk.ijse.spring.admin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping(value = "{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getCustomer(@PathVariable("id") String userName) {
        return service.getCustomer(userName);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteCustomer(@PathVariable("userName") String userName) {
        return service.deleteCustomer(userName);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveCustomer(@RequestBody CustomerDTO customer) {
        return service.saveCustomer(customer);
    }

    @PostMapping(value = "/clientlogin", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody CustomerDTO customerDTO){
        return service.canAuthenticate(customerDTO.getCus_UName(), customerDTO.getCus_Password());
    }

//    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
//    public long getCustomersCount(){
//        return service.getTotalCustomers();
//    }

}
