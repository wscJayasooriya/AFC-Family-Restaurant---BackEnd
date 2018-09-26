package lk.ijse.spring.admin.repository;

import lk.ijse.spring.admin.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT count(e.emp_ID) FROM Employee e")
    long getTotalEmployees();

}
