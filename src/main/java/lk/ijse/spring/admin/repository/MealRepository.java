package lk.ijse.spring.admin.repository;

import lk.ijse.spring.admin.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal,Integer> {
}
