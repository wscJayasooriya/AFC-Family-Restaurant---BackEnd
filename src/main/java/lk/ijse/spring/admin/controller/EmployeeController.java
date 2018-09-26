package lk.ijse.spring.admin.controller;

import lk.ijse.spring.admin.dto.EmployeeDTO;
import lk.ijse.spring.admin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<EmployeeDTO> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeDTO getEmployee(@PathVariable("id") int employeeID) {
        return service.getEmployee(employeeID);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteEmployee(@PathVariable("id") int employeeID) {
        return service.deleteEmployee(employeeID);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveEmployee(@RequestBody EmployeeDTO employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public long getEmployeesCount(){
        return service.getTotalEmployee();
    }

}
