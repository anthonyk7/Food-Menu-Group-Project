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

        Ingredient tomato = new Ingredient();
        tomato.setName("Tomato");

        Ingredient garlic = new Ingredient();
        garlic.setName("Garlic");

        Ingredient paprika = new Ingredient();
        paprika.setName("Paprika");

        Ingredient parsley = new Ingredient();
        parsley.setName("Parsley");

        Ingredient scallop = new Ingredient();
        scallop.setName("Scallop");

        Ingredient chorizoOil = new Ingredient();
        chorizoOil.setName("Chorizo Oil");

        Ingredient marconaAlmond = new Ingredient();
        marconaAlmond.setName("Marcona Almonds");

        Ingredient chickpea = new Ingredient();
        chickpea.setName("Chickpea");

        Ingredient chuckroll = new Ingredient();
        chuckroll.setName("Chuck Roll");

        Ingredient thyme = new Ingredient();
        thyme.setName("Thyme");

        Ingredient schallot = new Ingredient();
        schallot.setName("Schallots");

        Ingredient redBurgundy = new Ingredient();
        redBurgundy.setName("Red Burgundy");

        Ingredient potato = new Ingredient();
        potato.setName("Potato");

        Ingredient heavyCream = new Ingredient();
        heavyCream.setName("Heavy Cream");

        Ingredient milk = new Ingredient();
        milk.setName("Milk");

        Ingredient bouqetGarni = new Ingredient();
        bouqetGarni.setName("Bouqet Garni");

        Ingredient saffron = new Ingredient();
        saffron.setName("Saffron");

        Ingredient whiteWine = new Ingredient();
        whiteWine.setName("White Wine");

        Ingredient cauliflower = new Ingredient();
        cauliflower.setName("Cauliflower");

        Ingredient halibut = new Ingredient();
        halibut.setName("Halibut");

        Ingredient haricotVert = new Ingredient();
        haricotVert.setName("Haricot Vert");

        Ingredient fishStock = new Ingredient();
        fishStock.setName("Fish Stock");

        Ingredient foieGras = new Ingredient();
        foieGras.setName("Foie Gras");

        Ingredient redOnion = new Ingredient();
        redOnion.setName("Red Onion");

        Ingredient sugar = new Ingredient();
        sugar.setName("Sugar");

        Ingredient baguette = new Ingredient();
        baguette.setName("Baguette");

        Ingredient artichoke = new Ingredient();
        artichoke.setName("Artichoke");

        Ingredient vegetableStock = new Ingredient();
        vegetableStock.setName("Vegetable Stock");

        Ingredient tuna = new Ingredient();
        tuna.setName("Tuna");

        Ingredient olive = new Ingredient();
        olive.setName("Olives");

        Ingredient duck = new Ingredient();
        duck.setName("Duck");

        Ingredient orange = new Ingredient();
        orange.setName("Orange");

        Ingredient chickenStock = new Ingredient();
        chickenStock.setName("Chicken Stock");

        Ingredient zucciniBlossom = new Ingredient();
        zucciniBlossom.setName("Zuccini Blossoms");

        Ingredient watercress = new Ingredient();
        watercress.setName("Water Cress");

        Ingredient cremeCheese = new Ingredient();
        cremeCheese.setName("Creme Cheese");

        Ingredient puffPastry = new Ingredient();
        puffPastry.setName("Puff Pastry");

        Ingredient egg = new Ingredient();
        egg.setName("Egg");

        Ingredient tenderloin = new Ingredient();
        tenderloin.setName("Tenderloin");

        Ingredient smokedPork = new Ingredient();
        smokedPork.setName("Smoked Pork");

        Ingredient champignon = new Ingredient();
        champignon.setName("Champignon");

        Ingredient flour = new Ingredient();
        flour.setName("Flour");

        Ingredient vanillaSugar = new Ingredient();
        vanillaSugar.setName("Vanilla Sugar");

        Ingredient strawberry = new Ingredient();
        strawberry.setName("Strawberry");

        Ingredient chocolate = new Ingredient();
        chocolate.setName("Chocolate");

        Ingredient babySquid = new Ingredient();
        babySquid.setName("Baby Squid");

        Ingredient lolloRosso = new Ingredient();
        lolloRosso.setName("Lollo Rosso");

        Ingredient lolloBiondo = new Ingredient();
        lolloBiondo.setName("Lollo Biondo");

        Ingredient boneMarrowBone = new Ingredient();
        boneMarrowBone.setName("Bone Marrow");

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
