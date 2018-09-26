package lk.ijse.spring.admin.controller;

import lk.ijse.spring.admin.dto.CustomerDTO;
import lk.ijse.spring.admin.dto.MealDTO;
import lk.ijse.spring.admin.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/meals")
public class MealController {

    @Autowired
    private MealService mealService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<MealDTO> getAllMeals() {
        return mealService.getAllMeals();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public MealDTO getMeal(@PathVariable("id") String mealCode) {
        return mealService.getMeal(mealCode);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteMeal(@PathVariable("id") String mealCode) {
        return mealService.deleteMeal(mealCode);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveMeal(@RequestBody MealDTO meal) {
        return mealService.saveMeal(meal);
    }

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public int uploadFile(@RequestParam("file") MultipartFile[] files) {
        return mealService.uploadFile(files);
    }

    @GetMapping(value = "/file", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<InputStreamResource> downloadFile(@RequestParam(value = "path", required = false) String path) {
        return mealService.downloadFile(path);
    }

}
