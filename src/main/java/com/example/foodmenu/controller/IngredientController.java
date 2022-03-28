package com.example.foodmenu.controller;

import com.example.foodmenu.model.Dish;
import com.example.foodmenu.model.Ingredient;
import com.example.foodmenu.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @PostMapping("/saveIngredient")
    public String saveIngredient(@ModelAttribute("ingredient") Ingredient ingredient) {
        ingredientService.createIngredient(ingredient);
        return "redirect:/ingredients-form";
    }

    @PostMapping("/ingredients/remove/{id}")
    public String removeIngredient(@PathVariable("id") Integer id) {
        ingredientService.deleteIngredientById(id);
        return "redirect:/ingredients-form";
    }

    @GetMapping("/ingredients")
    public String findAllIngredients(Model model) {
        Ingredient ingredient = new Ingredient();
        model.addAttribute("ingredient", ingredient);
        List<Ingredient> ingredients = ingredientService.findAllIngredients();
        model.addAttribute("ingredientList", ingredients);
        return "ingredients-form";
    }
}
