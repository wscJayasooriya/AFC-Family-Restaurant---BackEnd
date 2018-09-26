package lk.ijse.spring.admin.service.impl;

import lk.ijse.spring.admin.dto.MealDTO;
import lk.ijse.spring.admin.entity.Meal;
import lk.ijse.spring.admin.repository.MealRepository;
import lk.ijse.spring.admin.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class MealServiceImpl implements MealService {

    @Autowired
    private MealRepository mealRepository;

    private String folderPath = "E:\\3rdSemFinal\\AFC Family Restaurant\\images\\";


    @Override
    public ArrayList<MealDTO> getAllMeals() {
        List<Meal> meals = mealRepository.findAll();

        ArrayList<MealDTO> alMeals=new ArrayList<>();

        for (Meal meal:meals) {
            MealDTO mealDTO = new MealDTO (
                    meal.getMealCode(),
                    meal.getMealName(),
                    meal.getDesription(),
                    meal.getSmallPrice(),
                    meal.getLargePrice(),
                    meal.getCategory(),
                    meal.getImageURL());
            alMeals.add(mealDTO);
        }
        return alMeals;
    }

    @Override
    public MealDTO getMeal(String mealName) {
        Meal meal= mealRepository.findById(Integer.parseInt(mealName)).get();
        MealDTO mealDTO=new MealDTO(
                meal.getMealCode(),
                meal.getMealName(),
                meal.getDesription(),
                meal.getSmallPrice(),
                meal.getLargePrice(),
                meal.getCategory(),
                meal.getImageURL());
        return  mealDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteMeal(String mealName) {
        mealRepository.deleteById(Integer.parseInt(mealName));
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveMeal(MealDTO mealDTO) {

        Meal meal = new Meal(mealDTO.getMealCode(),
                mealDTO.getMealName(),
                mealDTO.getDesription(),
                mealDTO.getSmallPrice(),
                mealDTO.getLargePrice(),
                mealDTO.getCategory(),
                mealDTO.getImageURL());

        mealRepository.save(meal);

        return true;
    }

    @Override
    public int uploadFile(MultipartFile[] files) {
        int reply = 0;
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                reply = 1;
            }
            try {
                // Get the file and save it somewhere
                byte[] bytes = file.getBytes();
                Path path = Paths.get(folderPath + file.getOriginalFilename());
                Files.write(path, bytes);

                reply = 2;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return reply;

    }

    @Override
    public ResponseEntity<InputStreamResource> downloadFile(String path) {
        File file = new File("" + folderPath + "" + path + "");
        InputStreamResource resource = null;
        try {
            resource = new InputStreamResource(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" +
                file.getName()).contentType(MediaType.APPLICATION_OCTET_STREAM).contentLength(file.length())
                .body(resource);

    }
}
