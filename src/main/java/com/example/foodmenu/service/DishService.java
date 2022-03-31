package com.example.foodmenu.service;

import com.example.foodmenu.dao.DishDAO;
import com.example.foodmenu.dao.IngredientDAO;
import com.example.foodmenu.model.Dish;
import com.example.foodmenu.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

@Service
public class DishService {

    @Autowired
    private DishDAO dishDAO;

    @Autowired
    private IngredientDAO ingredientDAO;

    public void addDish(Dish dish) {
        dish.setLikes(0);
        dishDAO.save(dish);
    }

    public List<Dish> findAllDishes() {
        List<Dish> dishes = new ArrayList<>();
        dishDAO.findAll().forEach(dishes::add);
        return dishes;
    }


    public Dish findById(Integer id) {
        Optional<Dish> optionalDish = dishDAO.findById(id);
        Dish dish;

        if (optionalDish.isPresent()) {
            dish = optionalDish.get();
        } else {
            throw new RuntimeException("Dish Not Found!");
        }
        return dish;
    }

    public List<Dish> findByKeyword(String keyword) {
        return dishDAO.findByName(keyword);
    }

    public void incrementLike(Dish dish) {
        dish.setLikes(dish.getLikes() + 1);
        dishDAO.save(dish);
    }

    public void removeIngredientFromDish(Dish dish, Ingredient ingredient) {
        dish.removeIngredient(ingredient);
        ingredientDAO.save(ingredient);
    }


    public void deleteDishById(Integer id) {

        Dish dish = dishDAO.findById(id).get();

        List<Ingredient> ingredients = dish.getIngredients();

       ingredients.forEach(ingredient ->removeIngredientFromDish(dish,ingredient));

       dishDAO.deleteById(id);

    }

/*
    public Page<Dish> findPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return this.dishDAO.findAll(pageable);
    }*/

    public List<Dish> getTypeOfDish(String keyword) {
        List<Dish> selectedDish = dishDAO.findByType(keyword);
        List<Dish> dishes = new ArrayList<>();
        if(keyword != null) {
            ThreadLocalRandom.current()
                    .ints(0, selectedDish.size())
                    .distinct().limit(7)
                    .forEach(p -> dishes.add(selectedDish.get(p)));
           dishes.forEach(System.out::println);
            return dishes;
        }
        return (List<Dish>) dishDAO.findAll();
    }

    public void addIngredientToDish(Integer dishID, Integer ingredientId) {
        Optional<Dish> optionalDish = dishDAO.findById(dishID);
        Optional<Ingredient> optionalIngredient = ingredientDAO.findById(ingredientId);

        if (optionalDish.isPresent() && optionalIngredient.isPresent()) {
            Dish dish = optionalDish.get();
            Ingredient ingredient = optionalIngredient.get();

            dish.addIngredient(ingredient);
            dishDAO.save(dish);
        } else {
            throw new RuntimeException("Dish Not Found!");
        }
    }

    public void removeIngredientFromDish(Integer dishID, Integer ingredientId) {
        Optional<Dish> optionalDish = dishDAO.findById(dishID);
        Optional<Ingredient> optionalIngredient = ingredientDAO.findById(ingredientId);

        if (optionalDish.isPresent() && optionalIngredient.isPresent()) {
            Dish dish = optionalDish.get();
            Ingredient ingredient = optionalIngredient.get();

            dish.removeIngredient(ingredient);
            dishDAO.save(dish);
        } else {
            throw new RuntimeException("Dish Not Found!");
        }
    }
}