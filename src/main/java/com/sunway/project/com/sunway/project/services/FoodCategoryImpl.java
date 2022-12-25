package com.sunway.project.com.sunway.project.services;

import com.sunway.project.com.sunway.project.entity.foodcategory.FoodCategory;
import com.sunway.project.com.sunway.project.repo.foodcategory.FoodCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodCategoryImpl implements  FoodCategoryService{


    @Autowired
    private FoodCategoryRepo foodCategoryRepo;

    @Override
    public FoodCategory save(FoodCategory foodCategory) {

        foodCategory= foodCategoryRepo.save(foodCategory);
        return foodCategory;
    }
}
