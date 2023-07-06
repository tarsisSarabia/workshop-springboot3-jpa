package com.sarabiacourses.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarabiacourses.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
