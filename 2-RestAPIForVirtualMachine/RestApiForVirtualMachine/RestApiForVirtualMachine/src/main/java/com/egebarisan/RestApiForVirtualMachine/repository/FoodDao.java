package com.egebarisan.RestApiForVirtualMachine.repository;


import com.egebarisan.RestApiForVirtualMachine.entity.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public class FoodDao {

    private final List<Food> foodList;


    public FoodDao() {
        this.foodList = new ArrayList<>();
        foodList.add(new Food(1, "Goulash Soap", "Eastern Europe", "Soap"));
        foodList.add(new Food(2, "Spicy Shoarma", "Poland", "Lunch"));
        foodList.add(new Food(3, "Korean Dumbling", "Korean", "Snack"));
        foodList.add(new Food(4, "Kebap", "Turkey", "Dinner"));

    }

    public List<Food> getAll() {
        return this.foodList;
    }

    public Food getFoodById(int id) {
        for (int i = 0; i < this.foodList.size(); i++) {
            if (this.foodList.get(i).getId() == id) {
                return this.foodList.get(i);
            }
        }
        log.info("Food is not found");
        return null;


    }

    public Food addFood(Food food) {
        this.foodList.add(food);
        return food;
    }


}
