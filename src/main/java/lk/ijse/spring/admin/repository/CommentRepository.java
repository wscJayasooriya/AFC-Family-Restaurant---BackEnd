package lk.ijse.spring.admin.repository;

import lk.ijse.spring.admin.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
