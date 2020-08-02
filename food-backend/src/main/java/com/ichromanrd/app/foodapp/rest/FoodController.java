package com.ichromanrd.app.foodapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ichromanrd.app.foodapp.model.Food;
import com.ichromanrd.app.foodapp.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {

    private FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Food>> listFood() {
        return new ResponseEntity<>(foodService.listFood(), HttpStatus.OK);
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Food> getOneFood(@PathVariable("id") Long id) {
        return new ResponseEntity<>(foodService.getFood(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public String saveFood(@RequestBody Food food) {
        foodService.saveFood(food);
        return "Food saved";
    }

}
