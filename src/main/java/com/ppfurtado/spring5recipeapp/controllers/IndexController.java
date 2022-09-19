package com.ppfurtado.spring5recipeapp.controllers;

import com.ppfurtado.spring5recipeapp.domain.Category;
import com.ppfurtado.spring5recipeapp.domain.UnitOfMeasure;
import com.ppfurtado.spring5recipeapp.repository.UnitOfMeasureRepository;
import com.ppfurtado.spring5recipeapp.repository.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        categoryOptional.ifPresent(category -> System.out.println("Cat Id is: " + category.getId()));
        unitOfMeasureOptional.ifPresent(uom -> System.out.println("Uom Id is: " + uom.getId()));

        return "index";
    }
}
