package com.example.foodmenu.model;

import javax.persistence.*;
import java.util.List;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer like) {
        this.likes = like;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        getIngredients().add(ingredient);
        ingredient.getDishes().add(this);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredient.getDishes().remove(this);

    }



}
