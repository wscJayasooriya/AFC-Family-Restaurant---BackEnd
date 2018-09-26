package lk.ijse.spring.admin.service;


import lk.ijse.spring.admin.dto.MealDTO;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

public interface MealService {

    public ArrayList<MealDTO> getAllMeals();

    public MealDTO getMeal(String mealName);

    public boolean deleteMeal(String mealName);

    public boolean saveMeal( MealDTO mealDTO);

    public int uploadFile(MultipartFile[] files);

    public ResponseEntity<InputStreamResource> downloadFile(String path);



}
