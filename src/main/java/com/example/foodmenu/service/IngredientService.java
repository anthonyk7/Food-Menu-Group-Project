package com.example.foodmenu.service;

import com.example.foodmenu.dao.IngredientDAO;
import com.example.foodmenu.model.Dish;
import com.example.foodmenu.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientDAO ingredientDAO;


    public List<Ingredient> findIngredientKeyWord(String keyword) {
        return ingredientDAO.findByKeyword(keyword);
    }

    public void createIngredient(Ingredient ingredient) {
        ingredientDAO.save(ingredient);
    }

    public void deleteIngredientById(Integer id) {
        ingredientDAO.deleteById(id);
    }

    public List<Ingredient> findAllIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredientDAO.findAll().forEach(ingredient -> ingredients.add(ingredient));
        return ingredients;
    }
}
