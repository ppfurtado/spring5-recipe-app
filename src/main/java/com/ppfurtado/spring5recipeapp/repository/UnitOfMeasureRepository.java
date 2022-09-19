package com.ppfurtado.spring5recipeapp.repository;

import com.ppfurtado.spring5recipeapp.domain.Category;
import com.ppfurtado.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasure , Long> {


    Optional<UnitOfMeasure> findByDescription(String description);
}
