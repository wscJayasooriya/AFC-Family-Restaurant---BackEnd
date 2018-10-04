package lk.ijse.spring.admin.repository;

import lk.ijse.spring.admin.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, String> {
}
