package com.store.persistence.repository;

import com.store.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryModel,Long> {

}
