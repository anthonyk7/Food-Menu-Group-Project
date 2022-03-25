package com.example.foodmenu.controller;

import com.example.foodmenu.model.Dish;
import com.example.foodmenu.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping("/addDish")
    public String addDish(Model model) {
        Dish dish = new Dish();
        model.addAttribute("dish", dish);
        return "add-dish-form";
    }

    @PostMapping("/saveDish")
    public String saveDish(Dish dish) {
        dishService.addDish(dish);
        return "redirect:/index";
    }

    @GetMapping("")
    public String findAllDishes(Model model) {
        List<Dish> dishes = dishService.findAllDishes();
        model.addAttribute("dishList", dishes);
        return "index";
    }
}
