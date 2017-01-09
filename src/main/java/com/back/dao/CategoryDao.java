package com.back.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.back.model.Category;
import com.back.model.Supplier;


@ComponentScan("com")
@Repository
public interface CategoryDao {
public void addCategory(Category category);

}
