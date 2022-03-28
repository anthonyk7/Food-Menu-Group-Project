package com.example.foodmenu.dao;

import com.example.foodmenu.model.Dish;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DishDAO extends CrudRepository<Dish, Integer>, PagingAndSortingRepository<Dish, Integer> {


}
