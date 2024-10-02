package com.learning.Ecommerce.repository;

import java.util.List;

import com.learning.Ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	public Boolean existsByName(String name);

	public List<Category> findByIsActiveTrue();

}
