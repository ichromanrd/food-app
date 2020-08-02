package com.ichromanrd.app.foodapp.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ichromanrd.app.foodapp.model.Food;
import com.ichromanrd.app.foodapp.model.FoodPrice;

public interface FoodRepository extends JpaRepository<Food, Long> {

    // select * from food where type = :type
    Food getByType(String type);
    List<Food> getAllByType(String type);

    // JPA named query
    @Query("SELECT f FROM Food f WHERE f.price <= 0 AND f.price >= 10000")
    List<Food> getFoodWithPriceRange();

    @Query(value = "SELECT * FROM food WHERE price <= 0 AND price >= 10000", nativeQuery = true)
    List<Food> getFoodWithPriceRangeSQL();

    // select price from food where id = ?
    FoodPrice getFoodPriceById(Long id);

}
