package com.sunway.project.com.sunway.project.repo.foodcategory;

import com.sunway.project.com.sunway.project.entity.foodcategory.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodCategoryRepo extends JpaRepository<FoodCategory,Integer> {
}
