package com.egebarisan.RestApiForVirtualMachine.service;

import com.egebarisan.RestApiForVirtualMachine.entity.Food;
import com.egebarisan.RestApiForVirtualMachine.repository.FoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private  FoodDao foodDao;

    public List<Food> getAll(){
        return this.foodDao.getAll();
    }

    public Food getFoodById(int id){
       return this.foodDao.getFoodById(id);
    }

    public Food addFood(Food food){
       return this.foodDao.addFood(food);
    }


}
