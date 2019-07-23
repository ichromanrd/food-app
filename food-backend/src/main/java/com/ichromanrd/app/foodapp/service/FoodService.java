package com.ichromanrd.app.foodapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ichromanrd.app.foodapp.model.Food;
import com.ichromanrd.app.foodapp.repository.FoodRepository;

@Service
public class FoodService {

    private FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> listFood() {
        List<Food> foods = new ArrayList<>();
        foodRepository.findAll().iterator().forEachRemaining(foods::add);
        return foods;
    }

    public Food getFood(Long id) {
        return foodRepository.findById(id).get();
    }

    public void saveFood(Food food) {
        foodRepository.save(food);
    }
}
