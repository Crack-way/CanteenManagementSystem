package com.sunway.project.com.sunway.project.repo.fooditem;

import com.sunway.project.com.sunway.project.entity.fooditems.FoodItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodItemRepo extends JpaRepository<FoodItems,Integer> {

}
