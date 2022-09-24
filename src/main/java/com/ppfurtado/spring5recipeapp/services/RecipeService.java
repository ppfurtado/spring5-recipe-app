package com.ppfurtado.spring5recipeapp.services;

import com.ppfurtado.spring5recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipe();
}
