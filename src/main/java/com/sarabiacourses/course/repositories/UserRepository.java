package com.sarabiacourses.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarabiacourses.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
