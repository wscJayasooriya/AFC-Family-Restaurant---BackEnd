package lk.ijse.spring.admin.service.impl;

import lk.ijse.spring.admin.dto.EmployeeDTO;
import lk.ijse.spring.admin.entity.Employee;
import lk.ijse.spring.admin.repository.EmployeeRepository;
import lk.ijse.spring.admin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ArrayList<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();

        ArrayList<EmployeeDTO> alEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            EmployeeDTO employeeDTO = new EmployeeDTO(employee.getEmp_ID(),
                    employee.getEmp_Name(),
                    employee.getEmp_Address(),
                    employee.getEmp_NIC(),
                    employee.getEmp_Contact(),
                    employee.getEmp_Salary()
            );

            alEmployees.add(employeeDTO);
        }

        return alEmployees;
    }

    @Override
    public EmployeeDTO getEmployee(int employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        EmployeeDTO employeeDTO = new EmployeeDTO(employee.getEmp_ID(),
                employee.getEmp_Name(),
                employee.getEmp_Address(),
                employee.getEmp_NIC(),
                employee.getEmp_Contact(),
                employee.getEmp_Salary());
        return employeeDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveEmployee(EmployeeDTO employee) {
        Employee emp= new Employee(
                employee.getEmp_Name(),
                employee.getEmp_Address(),
                employee.getEmp_NIC(),
                employee.getEmp_Contact(),
                employee.getEmp_Salary());
        employeeRepository.save(emp);

        return true;
    }

    @Override
    public long getTotalEmployee() {
        return employeeRepository.getTotalEmployees();
    }
}
