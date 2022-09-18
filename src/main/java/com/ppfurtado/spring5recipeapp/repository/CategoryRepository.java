package com.ppfurtado.spring5recipeapp.repository;

import com.ppfurtado.spring5recipeapp.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
