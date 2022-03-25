package com.example.foodmenu.dao;

import com.example.foodmenu.model.Ingredient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IngredientDAO extends CrudRepository<Ingredient, Integer> {

    @Query(value = "SELECT i FROM Ingredient i WHERE i.name like %:keyword%")
    List<Ingredient> findByKeyword(@Param("keyword")String keyword);
}
