package com.vishnu.restapi.api.v1.mapper;

import com.vishnu.restapi.api.v1.model.CategoryDTO;
import com.vishnu.restapi.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Data transfer object mapper using MapStruct
 */
@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
    Category categoryDTOToCategory(CategoryDTO categoryDTO);
}
