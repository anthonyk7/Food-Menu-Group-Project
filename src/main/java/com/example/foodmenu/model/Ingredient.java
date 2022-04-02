package com.example.foodmenu.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingredients")
@Getter
@Setter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;


    @ManyToMany
    @JoinColumn(name = "id")
    private List<Dish> dishes = new ArrayList<>();

    public void removeDish(Dish dish) {
        //getIngredients().remove(ingredient);
        dish.getIngredients().remove(this);

    }
}