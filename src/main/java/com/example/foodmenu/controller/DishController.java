package com.example.foodmenu.controller;

import com.example.foodmenu.model.Dish;
import com.example.foodmenu.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/like/{id}")
    public String like(@PathVariable(value = "id") Integer id) {
        Dish dish = dishService.findById(id);
        dishService.incrementLike(dish);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Integer id) {
        dishService.deleteDishById(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable(value = "id") Integer id, Model model) {
        Dish dish = dishService.findById(id);
        model.addAttribute("dish", dish);
        return "updatepage";
    }








}