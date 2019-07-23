package com.ichromanrd.app.foodapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.ichromanrd.app.foodapp.model.Food;

public interface FoodRepository extends CrudRepository<Food, Long> {
}
