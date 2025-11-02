package edu.icet.Controller;

import edu.icet.Model.dto.CustomerDTO;
import edu.icet.Model.dto.FoodDTO;
import edu.icet.service.CustomerService;
import edu.icet.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {
    @Autowired
    FoodService foodService;


    @GetMapping("/foods/all")
    public List<FoodDTO> getAllDetails(){
        return foodService.getAllDetails();
    }

    @PostMapping("/foods/add")
    public void add(@RequestBody FoodDTO food){
        foodService.add(food);
    }
}
