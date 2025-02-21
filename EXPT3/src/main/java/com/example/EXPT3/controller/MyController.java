package com.example.EXPT3.controller;

import com.example.EXPT3.entities.Course;
import com.example.EXPT3.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kanika/courses")  // Base API path
public class MyController {

    @Autowired
    private CourseService courseService;

    // Get all courses
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getCourses();
    }

    // Get a single course by ID
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable long id) {
        return courseService.getCourseById(id);
    }

    // Add a new course
    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    // Update an existing course
    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable long id, @RequestBody Course course) {
        return courseService.updateCourse(id, course);
    }

    // Delete a course
    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable long id) {
        courseService.deleteCourse(id);
        return "Course with ID " + id + " deleted successfully!";
    }
}
