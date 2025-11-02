package edu.icet.service;

import edu.icet.Model.dto.CustomerDTO;
import edu.icet.Model.dto.FoodDTO;
import edu.icet.Model.entitiy.CustomerEntity;
import edu.icet.Model.entitiy.FoodEntity;
import edu.icet.repository.CustomerRepository;
import edu.icet.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
    @Autowired
    FoodRepository foodRepository;

    public void add(FoodDTO food) {
        FoodEntity foodEntity=new FoodEntity(
                food.getId(),
                food.getName(),
                food.getAvailableQuantity(),
                food.getUnitPrice()
        );
        foodRepository.save(foodEntity);
    }

    public List<FoodDTO> getAllDetails() {
        List<FoodEntity> all = foodRepository.findAll();
        List<FoodDTO> foods = new ArrayList<>();

        for (FoodEntity foodEntity:all){
            foods.add(new FoodDTO(
                    foodEntity.getId(),
                    foodEntity.getName(),
                    foodEntity.getAvailableQuantity(),
                    foodEntity.getUnitPrice()
            ));
        }
        return foods;
    }
}

