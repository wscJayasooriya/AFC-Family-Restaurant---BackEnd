package lk.ijse.spring.admin.service.impl;

import lk.ijse.spring.admin.dto.VehicleDTO;
import lk.ijse.spring.admin.entity.Vehicle;
import lk.ijse.spring.admin.repository.VehicleRepository;
import lk.ijse.spring.admin.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public ArrayList<VehicleDTO> getAllVehicles() {
        List<Vehicle> vehicles = vehicleRepository.findAll();

        ArrayList<VehicleDTO> alEmployees = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            VehicleDTO vehicleDTO = new VehicleDTO(vehicle.getVeh_ID(),
                    vehicle.getVeh_Brand(),
                    vehicle.getVeh_No()
            );

            alEmployees.add(vehicleDTO);
        }

        return alEmployees;
    }

    @Override
    public VehicleDTO getVehicle(int vehicleId) {
        Vehicle vehicle = vehicleRepository.findById(vehicleId).get();
        VehicleDTO vehicleDTO = new VehicleDTO(vehicle.getVeh_ID(),
                vehicle.getVeh_Brand(),
                vehicle.getVeh_No());
        return vehicleDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteVehicle(int vehicleId) {
        vehicleRepository.deleteById(vehicleId);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveVehicle(VehicleDTO vehicle) {
        Vehicle vehi= new Vehicle(
                vehicle.getVeh_Brand(),
                vehicle.getVeh_No());
        vehicleRepository.save(vehi);

        return true;
    }

    @Override
    public long getTotalVehicles() {
        return vehicleRepository.getTotalVehicles();
    }
}
