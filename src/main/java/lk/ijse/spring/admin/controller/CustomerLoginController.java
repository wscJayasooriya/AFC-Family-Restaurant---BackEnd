package lk.ijse.spring.admin.controller;

import lk.ijse.spring.admin.dto.CustomerDTO;
import lk.ijse.spring.admin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/clientLogin")
public class CustomerLoginController {

    @Autowired
    private CustomerService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody CustomerDTO customerDTO){
        return service.canAuthenticate(customerDTO.getCus_UName(), customerDTO.getCus_Password());
    }
}
