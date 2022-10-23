package com.ppfurtado.spring5recipeapp.controllers;

import com.ppfurtado.spring5recipeapp.domain.Recipe;
import com.ppfurtado.spring5recipeapp.services.RecipeService;
import com.ppfurtado.spring5recipeapp.services.RecipeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


class IndexControllerTest {

    @Mock
    RecipeService service;

    @Mock
    Model model;

    @InjectMocks
    IndexController controller;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        controller = new IndexController(service);
    }

    @Test
    void getIndexPage() {

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe());
        recipes.add(new Recipe());

        when(service.getRecipe()).thenReturn(recipes);

        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        String viewName = controller.getIndexPage(model);

        assertEquals("index", viewName);
        verify(service, times(1)).getRecipe();
        verify(model, times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());
        Set<Recipe> setInController = argumentCaptor.getValue();
        assertEquals(2, setInController.size());


    }
}