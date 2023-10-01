package com.krishna.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
