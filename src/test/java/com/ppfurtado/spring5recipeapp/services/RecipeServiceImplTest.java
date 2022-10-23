package com.ppfurtado.spring5recipeapp.services;

import com.ppfurtado.spring5recipeapp.domain.Recipe;
import com.ppfurtado.spring5recipeapp.repository.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    @InjectMocks
    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository repository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        recipeService = new RecipeServiceImpl(repository);
    }

    @Test
    void getRecipe() {
        Set<Recipe> recipes = recipeService.getRecipe();
        List<Recipe> ListRecipe = new ArrayList<>();
        recipes.stream().iterator().forEachRemaining(ListRecipe::add);
        when(repository.findAll()).thenReturn(ListRecipe);
        Recipe recipe = new Recipe();
        recipes.add(recipe);
        assertEquals(1,recipes.size());
        verify(repository, times(1)).findAll();
    }
}