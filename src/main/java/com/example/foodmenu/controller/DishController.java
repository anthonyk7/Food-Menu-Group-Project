package com.example.foodmenu.controller;

import com.example.foodmenu.model.Dish;
import com.example.foodmenu.model.Ingredient;
import com.example.foodmenu.service.DishService;
import com.example.foodmenu.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
public class DishController {

    @Autowired
    private DishService dishService;

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/addDish")
    public String addDish(Model model) {
        Dish dish = new Dish();
        dish.setLikes(0);
        model.addAttribute("dish", dish);
        return "add-dish-form";
    }

    @PostMapping("/saveDish")
    public String saveDish(@ModelAttribute("dish") Dish dish) {
        dishService.addDish(dish);
        return "redirect:/";
    }

    /**
     * old controller method
     */

    @GetMapping("/")
    public String findAllDishes(Model model, String keyword) {
        if (keyword != null) {
            model.addAttribute("dishList", dishService.findByKeyword(keyword));
        } else {
            List<Dish> dishes = dishService.findAllDishes();
            model.addAttribute("dishList", dishes);

        }
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

    @GetMapping("/popDb")
    public String populateDatabase() {
        Dish dish1 = new Dish();

        dish1.setLikes(0);
        dish1.setName("Seared Endive Salad");
        dish1.setType("Veg");
        dish1.setIngredients(null);

        saveDish(dish1);

        Dish dish2 = new Dish();

        dish2.setLikes(0);
        dish2.setName("Salmon Tartar");
        dish2.setType("Fish");
        dish2.setIngredients(null);

        saveDish(dish2);

        Dish dish3 = new Dish();

        dish3.setLikes(0);
        dish3.setName("Vensison Carpaccio");
        dish3.setType("Meat");
        dish3.setIngredients(null);

        saveDish(dish3);

        Dish dish4 = new Dish();

        dish4.setLikes(0);
        dish4.setName("Ratatouille");
        dish4.setType("Veg");
        dish4.setIngredients(null);

        saveDish(dish4);

        Dish dish5 = new Dish();

        dish5.setLikes(0);
        dish5.setName("Seared Scallops");
        dish5.setType("Fish");
        dish5.setIngredients(null);

        saveDish(dish5);

        Dish dish6 = new Dish();

        dish6.setLikes(0);
        dish6.setName("Boeuf Bourguignon");
        dish6.setType("Meat");
        dish6.setIngredients(null);

        saveDish(dish6);

        Dish dish7 = new Dish();

        dish7.setLikes(0);
        dish7.setName("Saffron Baked Cauliflower");
        dish7.setType("Veg");
        dish7.setIngredients(null);

        saveDish(dish7);

        Dish dish8 = new Dish();

        dish8.setLikes(0);
        dish8.setName("Pan Seared Halibut");
        dish8.setType("Fish");
        dish8.setIngredients(null);

        saveDish(dish8);

        Dish dish9 = new Dish();

        dish9.setLikes(0);
        dish9.setName("Terrine de foie gras");
        dish9.setType("Meat");
        dish9.setIngredients(null);

        saveDish(dish9);

        Dish dish10 = new Dish();

        dish10.setLikes(0);
        dish10.setName("Artichoke ?? la barigoule");
        dish10.setType("Veg");
        dish10.setIngredients(null);

        saveDish(dish10);

        Dish dish11 = new Dish();

        dish11.setLikes(0);
        dish11.setName("Tuna steak & Olive salad");
        dish11.setType("Fish");
        dish11.setIngredients(null);

        saveDish(dish11);

        Dish dish12 = new Dish();

        dish12.setLikes(0);
        dish12.setName("Duck de l'orange");
        dish12.setType("Meat");
        dish12.setIngredients(null);

        saveDish(dish12);

        Dish dish13 = new Dish();

        dish13.setLikes(0);
        dish13.setName("Deep fried summer vegetables");
        dish13.setType("Veg");
        dish13.setIngredients(null);

        saveDish(dish13);

        Dish dish14 = new Dish();

        dish14.setLikes(0);
        dish14.setName("Salmon en croute");
        dish14.setType("Fish");
        dish14.setIngredients(null);

        saveDish(dish14);

        Dish dish15 = new Dish();

        dish15.setLikes(0);
        dish15.setName("Beef Wellington");
        dish15.setType("Meat");
        dish15.setIngredients(null);

        saveDish(dish15);

        Dish dish16 = new Dish();

        dish16.setLikes(0);
        dish16.setName("Chantilly Crepes");
        dish16.setType("Veg");
        dish16.setIngredients(null);

        saveDish(dish16);

        Dish dish17 = new Dish();

        dish17.setLikes(0);
        dish17.setName("Seared Baby Squid Salad");
        dish17.setType("Fish");
        dish17.setIngredients(null);

        saveDish(dish17);

        Dish dish18 = new Dish();

        dish18.setLikes(0);
        dish18.setName("Roast bone marrow & parsley salad");
        dish18.setType("Meat");
        dish18.setIngredients(null);

        saveDish(dish18);

        Dish dish19 = new Dish();

        dish19.setLikes(0);
        dish19.setName("Cheese omelette");
        dish19.setType("Veg");
        dish19.setIngredients(null);

        saveDish(dish19);

        Dish dish20 = new Dish();

        dish20.setLikes(0);
        dish20.setName("Sole Meuni??re");
        dish20.setType("Fish");
        dish20.setIngredients(null);

        saveDish(dish20);

        Dish dish21 = new Dish();

        dish21.setLikes(0);
        dish21.setName("Steak au Poivre");
        dish21.setType("Meat");
        dish21.setIngredients(null);

        saveDish(dish21);

        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable(value = "id") Integer id, Model model) {
        Dish dish = dishService.findById(id);
        model.addAttribute("dish", dish);
        return "updatepage";
    }

    @PostMapping("/saveupdate")
    public String saveUpdate(Dish dish, Model model) {
        dishService.addDish(dish);
        List<Dish> dishes = dishService.findAllDishes();
        model.addAttribute("dishList", dishes);
        return "index";
    }
/*
    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model, String keyword) {
        int pageSize = 5;


        if (keyword != null) {
            model.addAttribute("dishList", dishService.findByKeyword(keyword));
        } else {

            Page<Dish> page = dishService.findPaginated(pageNo, pageSize);
            List<Dish> dishes = page.getContent();

            model.addAttribute("currentPage", pageNo);
            model.addAttribute("totalPages", page.getTotalPages());
            model.addAttribute("totalItems", page.getTotalElements());
            model.addAttribute("listOfDishes", dishes);
        }
        return "index";
    }

    @GetMapping("/")
    public String viewHomePage(Model model, String keyword) {
        return findPaginated(1, model, keyword);
    }

*/
    @GetMapping("/dishOfTheWeek")
    public String dishOfTheWeek() {

        return "dishoftheweek/dishes-of-the-week";
    }

    @RequestMapping("/dishesOfTheWeekFish")
    public String fishesOfWeek(Model model, @Param("keyword") String keyword) {
        keyword = "Fish";
        List<Dish> listFish = dishService.getTypeOfDish(keyword);
        model.addAttribute("listFishes", listFish);
        model.addAttribute("keyword", keyword);
        return "dishoftheweek/dish-of-the-week-fish";
    }

    @RequestMapping("/dishesOfTheWeekMeat")
    public String MeatOfWeek(Model model, @Param("keyword") String keyword) {
        keyword = "Meat";
        List<Dish> listMeat = dishService.getTypeOfDish(keyword);
        model.addAttribute("listMeat", listMeat);
        model.addAttribute("keyword", keyword);
        return "dishoftheweek/dish-of-the-week-meat";
    }

    @RequestMapping("/dishesOfTheWeekVeg")
    public String VegOfWeek(Model model, @Param("keyword") String keyword) {
        keyword = "Veg";
        List<Dish> listVeg = dishService.getTypeOfDish(keyword);
        model.addAttribute("listVegies", listVeg);
        model.addAttribute("keyword", keyword);
        return "dishoftheweek/dish-of-the-week-veg";
    }

    @GetMapping("/ingredientsByDish/{dishId}")
    public String findAllIngredientsByDish(@PathVariable(value = "dishId") Integer dishId, Model model) {
        List<Ingredient> ingredients = dishService.findById(dishId).getIngredients();
        List<Ingredient> allIngredients = ingredientService.findAllIngredients();
        Dish dish = dishService.findById(dishId);

        model.addAttribute("ingredientList", allIngredients);
        model.addAttribute("ingredientListByDish", ingredients);
        model.addAttribute("dish", dish);

        return "ingredients-by-dish";
    }

    @GetMapping("/addIngredientToDish/{dishId}/{ingredientId}")
    public String addIngredientToDish(@PathVariable(value = "ingredientId") Integer ingredientId,@PathVariable(value = "dishId") Integer dishId) {
        dishService.addIngredientToDish(dishId, ingredientId);
        return "redirect:/ingredientsByDish/" + dishId;
    }

    @GetMapping("/removeIngredientFromDish/{dishId}/{ingredientId}")
    public String removeIngredientFromDish(@PathVariable(value = "dishId") Integer dishId,
                                           @PathVariable(value = "ingredientId") Integer ingredientId) {
        dishService.removeIngredientFromDish(dishId, ingredientId);
        return "redirect:/ingredientsByDish/" + dishId;
    }
}