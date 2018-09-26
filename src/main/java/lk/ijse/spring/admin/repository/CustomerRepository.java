package lk.ijse.spring.admin.repository;

import lk.ijse.spring.admin.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, String> {

//    @Query("SELECT count(c.cus_ID) FROM Customer c")
//    long getTotalCustomers();

}
