package com.egebarisan.RestApiForVirtualMachine.api.controller;


import com.egebarisan.RestApiForVirtualMachine.entity.Food;
import com.egebarisan.RestApiForVirtualMachine.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/hello")
    public String sayHi(){
        return "Hello Guys !";
    }

    @GetMapping("/getAll")
    public List<Food> findAll() {
        return this.foodService.getAll();
    }

    @GetMapping("/getFood")
    public Food getFoodById(@RequestParam int id) {
        return this.foodService.getFoodById(id);
    }

    @PostMapping("/add")
    public Food addFood(@RequestBody Food food) {
        return this.foodService.addFood(food);
    }


}
