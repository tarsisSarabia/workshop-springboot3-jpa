package com.sarabiacourses.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarabiacourses.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
