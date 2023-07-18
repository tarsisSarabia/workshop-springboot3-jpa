package com.sarabiacourses.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarabiacourses.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
