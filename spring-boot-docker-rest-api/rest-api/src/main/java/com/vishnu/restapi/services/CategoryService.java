package com.vishnu.restapi.services;

import com.vishnu.restapi.api.v1.model.CategoryDTO;
import com.vishnu.restapi.domain.Category;

import java.util.List;

/**
 * Category Interface
 */
public interface CategoryService {

    List<CategoryDTO> getCategories();
    CategoryDTO findByCategoryName(String categoryName);
}
