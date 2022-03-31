package com.example.foodmenu.service;

import com.example.foodmenu.dao.DishDAO;
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

    @Autowired
    private DishDAO dishDAO;


    public List<Ingredient> findIngredientKeyWord(String keyword) {
        return ingredientDAO.findByKeyword(keyword);
    }

    public void createIngredient(Ingredient ingredient) {
        ingredientDAO.save(ingredient);
    }

    public void deleteIngredientById(Integer id) {
        Ingredient ingredient = ingredientDAO.findById(id).get();
        List<Dish> dishes = ingredient.getDishes();
        dishes.forEach(dish -> removeDishFromIngredient(dish, ingredient));
        ingredientDAO.deleteById(id);

    }

    private void removeDishFromIngredient(Dish dish, Ingredient ingredient) {
        ingredient.removeDish(dish);
        dishDAO.save(dish);
    }

    public List<Ingredient> findAllIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredientDAO.findAll().forEach(ingredient -> ingredients.add(ingredient));
        return ingredients;
    }
}
