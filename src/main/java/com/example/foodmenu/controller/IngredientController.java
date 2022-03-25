package com.example.foodmenu.controller;

import com.example.foodmenu.model.Dish;
import com.example.foodmenu.model.Ingredient;
import com.example.foodmenu.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @PostMapping("ingredients/add")
    public String addIngredient(Ingredient ingredient) {
        ingredientService.createIngredient(ingredient);
        return "redirect:/ingredient-form";
    }

    @PostMapping("ingredients/remove/{id}")
    public String removeIngredient(@PathVariable("id") Integer id) {
        ingredientService.deleteIngredientById(id);
        return "redirect:/ingredient-form";
    }

    @GetMapping("/ingredients")
    public String findAllIngredients(Model model) {
        List<Ingredient> ingredients = ingredientService.findAllIngredients();
        model.addAttribute("ingredientList", ingredients);
        return "ingredient-form";
    }
}
