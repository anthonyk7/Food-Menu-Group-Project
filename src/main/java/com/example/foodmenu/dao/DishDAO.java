package com.example.foodmenu.dao;

import com.example.foodmenu.model.Dish;
import org.springframework.data.repository.CrudRepository;

public interface DishDAO extends CrudRepository<Dish, Integer> {
}
