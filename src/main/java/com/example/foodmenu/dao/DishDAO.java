package com.example.foodmenu.dao;

import com.example.foodmenu.model.Dish;
import com.example.foodmenu.model.Ingredient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DishDAO extends CrudRepository<Dish, Integer>, PagingAndSortingRepository<Dish, Integer> {

    @Query(value = "SELECT i FROM Dish i WHERE i.name like %:keyword%")
    List<Dish> findByName(@Param("keyword")String keyword);


    @Query(value = "SELECT i FROM Dish i WHERE i.type like %:typeOfFood%")
    List<Dish> findByType(@Param("keyword")String typeOfFood);

}
