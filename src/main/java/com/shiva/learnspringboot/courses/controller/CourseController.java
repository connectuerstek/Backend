package com.shiva.learnspringboot.courses.controller;

import com.shiva.learnspringboot.courses.bean.Course;

import com.shiva.learnspringboot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    //http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return repository.findAll();
//        return Arrays.asList(new Course(1, "Learn MicroServices", "inShiva"),
//                new Course(2, "Java Full Stack", "inShiva"));
    }
    @GetMapping("/courses/{id}")
    public Course coursesDetail(@PathVariable long id){
        Optional<Course> course = repository.findById(id);

        if(course.isEmpty()){
            throw new RuntimeException("Course not found with the id " + id);
        }

        return course.get();

    }
    //POST- create a new resource(/courses)
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        repository.save(course);
    }

    //PUT/ update/replace a resource(/course/1)
    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course){
        repository.save(course);
    }
    //DELETE

/*
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id){
        repository.deleteById(id);
    }
*/
    }

