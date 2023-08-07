package com.shiva.learnspringboot.courses.repository;

import com.shiva.learnspringboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {



}
