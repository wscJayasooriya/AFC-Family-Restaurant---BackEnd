package lk.ijse.spring.admin.service;

import lk.ijse.spring.admin.dto.EmployeeDTO;

import java.util.ArrayList;

public interface EmployeeService {

    public ArrayList<EmployeeDTO> getAllEmployees();

    public EmployeeDTO getEmployee(int employeeId);

    public boolean deleteEmployee(int employeeId);

    public boolean saveEmployee(EmployeeDTO employee);

    public long getTotalEmployee();
}
