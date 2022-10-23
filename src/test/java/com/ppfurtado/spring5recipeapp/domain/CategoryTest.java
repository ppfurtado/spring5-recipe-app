package com.ppfurtado.spring5recipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    void getId() {
        category.setId(5L);

        assertEquals(5L,category.getId());
    }

    @Test
    void getDescription() {
        category.setDescription("teste");

        assertEquals("teste",category.getDescription());
    }

    @Test
    void getRecipes() {
    }
}