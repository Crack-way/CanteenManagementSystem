package com.sunway.project.com.sunway.project.controller;

import com.sunway.project.com.sunway.project.entity.foodcategory.FoodCategory;
import com.sunway.project.com.sunway.project.entity.fooditems.FoodItems;
import com.sunway.project.com.sunway.project.enums.VegOrNonVeg;
import com.sunway.project.com.sunway.project.services.FoodItemService;
import com.sunway.project.com.sunway.project.services.FoodCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private FoodItemService foodItemService;

    @Autowired
    private FoodCategoryService foodCategoryService;

    @GetMapping("/hello")
    public String helloWorld(@RequestParam("msg") String msg){

        FoodItems foodItems=new FoodItems();
        foodItems.setName("Momo");
        foodItems.setPrice(100);
        foodItems.setQuantity(1);
        foodItems.setVegOrNonVegItem(VegOrNonVeg.NON_VEG);
        foodItemService.save(foodItems);


        FoodCategory foodCategory=new FoodCategory();

        foodCategory.setVegOrNonVeg(VegOrNonVeg.NON_VEG);
        foodCategoryService.save(foodCategory);


        System.out.println("Hello world");
        return "Request accepted";
    }
}
