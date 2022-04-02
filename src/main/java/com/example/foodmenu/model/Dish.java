package com.example.foodmenu.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "dishes")
public class Dish {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String type;

    @ManyToMany(mappedBy = "dishes", cascade =  CascadeType.PERSIST)
    private List<Ingredient> ingredients = new java.util.ArrayList<>();

    private Integer likes;

    public void addIngredient(Ingredient ingredient) {
        getIngredients().add(ingredient);
        ingredient.getDishes().add(this);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredient.getDishes().remove(this);

    }
}
