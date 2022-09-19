package com.ppfurtado.spring5recipeapp.repository;

import com.ppfurtado.spring5recipeapp.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
