package com.sunway.project.com.sunway.project.entity.foodcategory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sunway.project.com.sunway.project.entity.fooditems.FoodItems;
import com.sunway.project.com.sunway.project.enums.VegOrNonVeg;

import javax.persistence.*;

@Entity
@Table(name="food_category")
public class FoodCategory {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "food_id", referencedColumnName = "id")
    private FoodItems foodItems;


    @Enumerated(EnumType.STRING)
    private VegOrNonVeg vegOrNonVeg ;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FoodItems getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(FoodItems foodItems) {
        this.foodItems = foodItems;
    }

    public VegOrNonVeg getVegOrNonVeg() {
        return vegOrNonVeg;
    }

    public void setVegOrNonVeg(VegOrNonVeg vegOrNonVeg) {
        this.vegOrNonVeg = vegOrNonVeg;
    }
}
