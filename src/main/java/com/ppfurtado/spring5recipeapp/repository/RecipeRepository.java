package com.ppfurtado.spring5recipeapp.repository;

import com.ppfurtado.spring5recipeapp.domain.Category;
import com.ppfurtado.spring5recipeapp.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
