package com.sunway.project.com.sunway.project.entity.fooditems;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sunway.project.com.sunway.project.entity.foodcategory.FoodCategory;
import com.sunway.project.com.sunway.project.enums.VegOrNonVeg;

import javax.persistence.*;

@Entity
@Table(name = "Food_items")
public class FoodItems {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;


    @OneToOne(mappedBy = "foodItems")
    @JsonIgnore
    private FoodCategory foodCategory;
    private String name;
    private float price;
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private VegOrNonVeg vegOrNonVegItem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public VegOrNonVeg getVegOrNonVegItem() {
        return vegOrNonVegItem;
    }

    public void setVegOrNonVegItem(VegOrNonVeg vegOrNonVegItem) {
        this.vegOrNonVegItem = vegOrNonVegItem;
    }


    public FoodCategory getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(FoodCategory foodCategory) {
        this.foodCategory = foodCategory;
    }
}





















