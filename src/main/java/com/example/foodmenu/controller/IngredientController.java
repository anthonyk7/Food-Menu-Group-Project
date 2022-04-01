package com.example.foodmenu.controller;

import com.example.foodmenu.model.Ingredient;
import com.example.foodmenu.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @PostMapping("/saveIngredient")
    public String saveIngredient(@ModelAttribute("ingredient") Ingredient ingredient) {
        ingredientService.createIngredient(ingredient);
        return "redirect:/ingredients";
    }

    @RequestMapping("/ingredients/remove/{id}")
    public String removeIngredient(@PathVariable("id") Integer id) {
        ingredientService.deleteIngredientById(id);

        return "redirect:/ingredients";
    }

    @GetMapping("/ingredients")
    public String findAllIngredients(Model model) {
        Ingredient ingredient = new Ingredient();
        model.addAttribute("ingredient", ingredient);
        List<Ingredient> ingredients = ingredientService.findAllIngredients();
        model.addAttribute("ingredientList", ingredients);

        return "ingredients-form";
    }


    @GetMapping("/popDbIngridients")
    public String populateDatabase() {
        Ingredient endive = new Ingredient();
        endive.setName("Endive");
        saveIngredient(endive);


        Ingredient butter = new Ingredient();
        butter.setName("Butter");

        saveIngredient(butter);

        Ingredient walnut = new Ingredient();
        walnut.setName("Walnut");

        saveIngredient(walnut);

        Ingredient roquefort = new Ingredient();
        roquefort.setName("Roquefort");

        saveIngredient(roquefort);

        Ingredient pear = new Ingredient();
        pear.setName("Pear");

        saveIngredient(pear);

        Ingredient spinach = new Ingredient();
        spinach.setName("Spinach");

        saveIngredient(spinach);

        Ingredient sherryVinegar = new Ingredient();
        sherryVinegar.setName("Sherry Vinegar");

        saveIngredient(sherryVinegar);

        Ingredient salmon = new Ingredient();
        salmon.setName("Salmon");

        saveIngredient(salmon);


        Ingredient dill = new Ingredient();
        dill.setName("Dill");

        saveIngredient(dill);

        Ingredient avocado = new Ingredient();
        avocado.setName("Avocado");

        saveIngredient(avocado);

        Ingredient majonnaise = new Ingredient();
        majonnaise.setName("Majonnaise");

        saveIngredient(majonnaise);

        Ingredient cucumber = new Ingredient();
        cucumber.setName("Cucumber");

        saveIngredient(cucumber);

        Ingredient lemon = new Ingredient();
        lemon.setName("Lemon");

        saveIngredient(lemon);

        Ingredient venison = new Ingredient();
        venison.setName("Venison");

        saveIngredient(venison);

        Ingredient parmensan = new Ingredient();
        parmensan.setName("Parmesan");

        saveIngredient(parmensan);

        Ingredient caper = new Ingredient();
        caper.setName("Capers");

        saveIngredient(caper);

        Ingredient ruccola = new Ingredient();
        ruccola.setName("Ruccola");

        saveIngredient(ruccola);

        Ingredient chervil = new Ingredient();
        chervil.setName("Chervil");

        saveIngredient(chervil);

        Ingredient oliveoil = new Ingredient();
        oliveoil.setName("Olive Oil");

        saveIngredient(oliveoil);

        Ingredient pinenuts = new Ingredient();
        pinenuts.setName("Pinenuts");

        saveIngredient(pinenuts);

        Ingredient aubergine = new Ingredient();
        aubergine.setName("Aubergine");

        saveIngredient(aubergine);

        Ingredient zuccini = new Ingredient();
        zuccini.setName("Zuccini");

        saveIngredient(zuccini);

        Ingredient carrot = new Ingredient();
        carrot.setName("Carrot");

        saveIngredient(carrot);

        Ingredient tomato = new Ingredient();
        tomato.setName("Tomato");

        saveIngredient(tomato);

        Ingredient garlic = new Ingredient();
        garlic.setName("Garlic");

        saveIngredient(garlic);

        Ingredient paprika = new Ingredient();
        paprika.setName("Paprika");

        saveIngredient(paprika);

        Ingredient parsley = new Ingredient();
        parsley.setName("Parsley");

        saveIngredient(parsley);

        Ingredient scallop = new Ingredient();
        scallop.setName("Scallop");

        saveIngredient(scallop);

        Ingredient chorizoOil = new Ingredient();
        chorizoOil.setName("Chorizo Oil");

        saveIngredient(chorizoOil);

        Ingredient marconaAlmond = new Ingredient();
        marconaAlmond.setName("Marcona Almonds");

        saveIngredient(marconaAlmond);

        Ingredient chickpea = new Ingredient();
        chickpea.setName("Chickpea");

        saveIngredient(chickpea);

        Ingredient chuckroll = new Ingredient();
        chuckroll.setName("Chuck Roll");

        Ingredient thyme = new Ingredient();
        thyme.setName("Thyme");

        saveIngredient(thyme);

        Ingredient schallot = new Ingredient();
        schallot.setName("Schallots");

        saveIngredient(schallot);

        Ingredient redBurgundy = new Ingredient();
        redBurgundy.setName("Red Burgundy");

        saveIngredient(redBurgundy);

        Ingredient potato = new Ingredient();
        potato.setName("Potato");

        saveIngredient(potato);

        Ingredient heavyCream = new Ingredient();
        heavyCream.setName("Heavy Cream");

        saveIngredient(heavyCream);

        Ingredient milk = new Ingredient();
        milk.setName("Milk");

        saveIngredient(milk);

        Ingredient bouqetGarni = new Ingredient();
        bouqetGarni.setName("Bouqet Garni");

        saveIngredient(bouqetGarni);

        Ingredient saffron = new Ingredient();
        saffron.setName("Saffron");

        saveIngredient(saffron);

        Ingredient whiteWine = new Ingredient();
        whiteWine.setName("White Wine");

        saveIngredient(whiteWine);

        Ingredient cauliflower = new Ingredient();
        cauliflower.setName("Cauliflower");

        saveIngredient(cauliflower);

        Ingredient halibut = new Ingredient();
        halibut.setName("Halibut");

        saveIngredient(halibut);

        Ingredient haricotVert = new Ingredient();
        haricotVert.setName("Haricot Vert");

        saveIngredient(haricotVert);

        Ingredient fishStock = new Ingredient();
        fishStock.setName("Fish Stock");

        saveIngredient(fishStock);

        Ingredient foieGras = new Ingredient();
        foieGras.setName("Foie Gras");

        saveIngredient(foieGras);

        Ingredient redOnion = new Ingredient();
        redOnion.setName("Red Onion");

        saveIngredient(redOnion);

        Ingredient baguette = new Ingredient();
        baguette.setName("Baguette");

        saveIngredient(baguette);

        Ingredient artichoke = new Ingredient();
        artichoke.setName("Artichoke");

        saveIngredient(artichoke);

        Ingredient vegetableStock = new Ingredient();
        vegetableStock.setName("Vegetable Stock");

        saveIngredient(vegetableStock);

        Ingredient tuna = new Ingredient();
        tuna.setName("Tuna");

        saveIngredient(tuna);

        Ingredient olive = new Ingredient();
        olive.setName("Olives");

        saveIngredient(olive);

        Ingredient duck = new Ingredient();
        duck.setName("Duck");

        saveIngredient(duck);

        Ingredient orange = new Ingredient();
        orange.setName("Orange");

        saveIngredient(orange);

        Ingredient chickenStock = new Ingredient();
        chickenStock.setName("Chicken Stock");

        saveIngredient(chickenStock);

        Ingredient zucciniBlossom = new Ingredient();
        zucciniBlossom.setName("Zuccini Blossoms");

        saveIngredient(zucciniBlossom);

        Ingredient watercress = new Ingredient();
        watercress.setName("Water Cress");

        saveIngredient(watercress);

        Ingredient cremeCheese = new Ingredient();
        cremeCheese.setName("Creme Cheese");

        saveIngredient(cremeCheese);

        Ingredient puffPastry = new Ingredient();
        puffPastry.setName("Puff Pastry");

        saveIngredient(puffPastry);

        Ingredient egg = new Ingredient();
        egg.setName("Egg");

        saveIngredient(egg);

        Ingredient tenderloin = new Ingredient();
        tenderloin.setName("Tenderloin");

        saveIngredient(tenderloin);

        Ingredient smokedPork = new Ingredient();
        smokedPork.setName("Smoked Pork");

        saveIngredient(smokedPork);

        Ingredient champignon = new Ingredient();
        champignon.setName("Champignon");

        saveIngredient(champignon);

        Ingredient flour = new Ingredient();
        flour.setName("Flour");

        saveIngredient(flour);

        Ingredient vanillaSugar = new Ingredient();
        vanillaSugar.setName("Vanilla Sugar");

        saveIngredient(vanillaSugar);

        Ingredient strawberry = new Ingredient();
        strawberry.setName("Strawberry");

        saveIngredient(strawberry);

        Ingredient chocolate = new Ingredient();
        chocolate.setName("Chocolate");

        saveIngredient(chocolate);

        Ingredient babySquid = new Ingredient();
        babySquid.setName("Baby Squid");

        saveIngredient(babySquid);

        Ingredient lolloRosso = new Ingredient();
        lolloRosso.setName("Lollo Rosso");

        saveIngredient(lolloRosso);

        Ingredient boneMarrowBone = new Ingredient();
        boneMarrowBone.setName("Bone Marrow");

        saveIngredient(boneMarrowBone);

        Ingredient sourDoughBread = new Ingredient();
        sourDoughBread.setName("Sourdough Bread");

        Ingredient gruyere = new Ingredient();
        gruyere.setName("Gruyere");

        Ingredient sole = new Ingredient();
        sole.setName("Sole");

        Ingredient blackPepper = new Ingredient();
        blackPepper.setName("Black Pepper");

        Ingredient redPepper = new Ingredient();
        redPepper.setName("Red Pepper");

        Ingredient greenPepper = new Ingredient();
        greenPepper.setName("");

        Ingredient beefStock = new Ingredient();
        beefStock.setName("Beef Stock");

        Ingredient cognac = new Ingredient();
        cognac.setName("Cognac");

        Ingredient dijon = new Ingredient();
        dijon.setName("Dijon");

        Ingredient asparagus = new Ingredient();
        asparagus.setName("Asparagus");


        return "redirect:/";
    }
}
