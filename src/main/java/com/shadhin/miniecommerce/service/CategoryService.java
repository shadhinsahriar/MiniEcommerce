package com.shadhin.miniecommerce.service;

import com.shadhin.miniecommerce.entity.Category;
import com.shadhin.miniecommerce.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> viewAllCategory() {
        return categoryRepository.findAll();
    }

    public Category getCategoryByID(String name) {
        return categoryRepository.findByName(name);
    }

    public void deleteCategory(String name) {
        categoryRepository.delete(categoryRepository.findByName(name));
    }

    public Category updateCategory(Category category) {
        Category C = categoryRepository.findByName(category.getName());

        C.setName(category.getName());
        C.setDescription(category.getDescription());
        C.setProducts(category.getProducts());

        return categoryRepository.save(C);
    }
}
