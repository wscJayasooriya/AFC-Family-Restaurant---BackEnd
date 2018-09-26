package lk.ijse.spring.admin.controller;

import lk.ijse.spring.admin.dto.CustomerDTO;
import lk.ijse.spring.admin.dto.VehicleDTO;
import lk.ijse.spring.admin.service.CustomerService;
import lk.ijse.spring.admin.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<VehicleDTO> getAllVehicles() {
        return service.getAllVehicles();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public VehicleDTO getVehicle(@PathVariable("id") int vehicleID) {
        return service.getVehicle(vehicleID);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteVehicle(@PathVariable("id") int vehicleID) {
        return service.deleteVehicle(vehicleID);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveVehicle(@RequestBody VehicleDTO vehicle) {
        return service.saveVehicle(vehicle);
    }

    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public long getVehiclesCount(){
        return service.getTotalVehicles();
    }

}
