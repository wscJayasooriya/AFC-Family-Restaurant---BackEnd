package lk.ijse.spring.admin.service;


import lk.ijse.spring.admin.dto.VehicleDTO;

import java.util.ArrayList;

public interface VehicleService {

    public ArrayList<VehicleDTO> getAllVehicles();

    public VehicleDTO getVehicle(int vehicleId);

    public boolean deleteVehicle(int vehicleId);

    public boolean saveVehicle(VehicleDTO vehicle);

    public long getTotalVehicles();

}
