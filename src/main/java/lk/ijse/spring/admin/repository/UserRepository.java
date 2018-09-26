package lk.ijse.spring.admin.repository;

import lk.ijse.spring.admin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
