package lk.ijse.spring.admin.repository;

import lk.ijse.spring.admin.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

    @Query("SELECT count(v.veh_ID) FROM Vehicle v")
    long getTotalVehicles();

}
