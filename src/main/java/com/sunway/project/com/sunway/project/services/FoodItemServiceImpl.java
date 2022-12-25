package com.sunway.project.com.sunway.project.services;
import com.sunway.project.com.sunway.project.entity.fooditems.FoodItems;
import com.sunway.project.com.sunway.project.repo.fooditem.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemServiceImpl implements  FoodItemService{

    @Autowired
    private FoodItemRepo foodItemRepo;

    @Override
    public FoodItems save(FoodItems foodItems){
        foodItems=foodItemRepo.save(foodItems);
        return foodItems;
    }



}
