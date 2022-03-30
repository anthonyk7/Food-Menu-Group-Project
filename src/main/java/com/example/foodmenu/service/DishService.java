package com.example.foodmenu.service;

import com.example.foodmenu.dao.DishDAO;
import com.example.foodmenu.model.Dish;
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

    public void deleteDishById(Integer id) {
        dishDAO.deleteById(id);
    }


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
}