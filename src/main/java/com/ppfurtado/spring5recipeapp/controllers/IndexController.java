package com.ppfurtado.spring5recipeapp.controllers;

import com.ppfurtado.spring5recipeapp.domain.Recipe;
import com.ppfurtado.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("Getting Index page");

        Set<Recipe> recipes = recipeService.getRecipe();

        model.addAttribute("recipes", recipes);

        return "index";
    }
}
