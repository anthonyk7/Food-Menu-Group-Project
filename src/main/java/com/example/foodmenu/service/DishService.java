package com.example.foodmenu.service;

import com.example.foodmenu.dao.DishDAO;
import com.example.foodmenu.model.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DishService {

    @Autowired
    private DishDAO dishDAO;


    public void addDish(Dish dish)  {
        dishDAO.save(dish);
    }

    public List<Dish> findAllDishes() {
        List<Dish> dishes = new ArrayList<>();
        dishDAO.findAll().forEach(dish -> dishes.add(dish));
        return dishes;
    }

    public Dish findById(Integer id) {
        Optional<Dish> optionalDish = dishDAO.findById(id);
        Dish dish;

        if(optionalDish.isPresent()) {
            dish = optionalDish.get();
        } else {
            throw new RuntimeException("Dish Not Found!");
        }
        return dish;
    }

    public void incrementLike(Dish dish) {
        dish.setLikes(1);
        dishDAO.save(dish);
    }



}